-- ORDERING RESULTS

SELECT * FROM city;

-- Populations of all countries in descending order
SELECT name, population
FROM country
ORDER BY population;

SELECT name, population
FROM country
ORDER BY population DESC;

--Names of countries and continents in ascending order
SELECT name, continent
FROM country
ORDER BY name ASC;

--ASC is the default order
SELECT name, continent
FROM country
ORDER BY name;

SELECT continent, name, population
FROM country
ORDER BY continent, population DESC;


-- LIMITING RESULTS
-- The name and average life expectancy of the countries with the 10 highest life expectancies.
SELECT name, lifeexpectancy
FROM country
WHERE lifeexpectancy IS NOT NULL
ORDER BY lifeexpectancy DESC
LIMIT 10;

-- built in function: round()
SELECT round(gnp/population, 4)
FROM country
WHERE gnp > 0;



-- CONCATENATING OUTPUTS

-- The name & state of all cities in California, Oregon, or Washington.
-- "city, state", sorted by state then city
SELECT (name || ', ' || district) AS name_and_state
FROM city
WHERE district IN('California', 'Oregon', 'Washington')
ORDER BY district, name;


-- AGGREGATE FUNCTIONS
-- Average Life Expectancy in the World
SELECT AVG(lifeexpectancy)
FROM country;

-- Total population in Ohio
SELECT SUM(population)
FROM city
WHERE district ='Ohio';

-- The surface area of the smallest country in the world
SELECT MIN(surfacearea)
FROM country;

--The surface area of the largest coutnry in the world
SELECT MAX(population)
FROM country;

-- The 10 largest countries in the world


-- The number of countries who declared independence in 1991
-- Apparently count is almost always used with the asteric * in the parenthesis (*)!
SELECT COUNT(*)
FROM country
WHERE indepyear = 1991;

SELECT MIN(population), region
FROM country
GROUP BY region;

-- GROUP BY
-- Count the number of countries where each language is spoken, ordered from most countries to least
SELECT  language, COUNT(*) AS count_of_countries
FROM countrylanguage
GROUP BY language
ORDER BY count_of_countries DESC;

-- Average life expectancy of each continent ordered from highest to lowest
SELECT continent, AVG(lifeexpectancy) AS avg_life_expectancy
FROM country
WHERE continent != 'Antarctica'
GROUP BY continent
ORDER BY avg_life_expectancy DESC;

-- Exclude Antarctica from consideration for average life expectancy


-- Sum of the population of cities in each state in the USA ordered by state name
SELECT district, SUM(population) AS sum_of_population
FROM city
WHERE countrycode = 'USA'
GROUP BY district
ORDER BY district;

-- The average population of cities in each state in the USA ordered by state name
SELECT district, AVG(population) AS sum_of_population
FROM city
WHERE countrycode = 'USA'
GROUP BY district
ORDER BY district;

-- The average rounded
SELECT district, round(AVG(population), 2)
FROM city
WHERE countrycode = 'USA'
GROUP BY district
ORDER BY district;

-- multiple aggregates can be included
SELECT district, name, round(AVG(population), 2), MAX (population), MIN(population), COUNT(*)
FROM city
WHERE countrycode = 'USA'
GROUP BY district, name
ORDER BY district;


-- SUBQUERIES
-- Find the names of cities under a given government leader

SELECT * FROM city
WHERE countrycode IN (SELECT code FROM country WHERE headofstate = 'Elisabeth II');

-- Find the names of cities whose country they belong to has not declared independence yet


SELECT * FROM city WHERE countrycode IN (SELECT code FROM country WHERE indepyear IS NULL);

SELECT 

-- Additional samples
-- You may alias column and table names to be more descriptive

-- Alias can also be used to create shorthand references, such as "c" for city and "co" for country.

-- Ordering allows columns to be displayed in ascending order, or descending order (Look at Arlington)

-- Limiting results allows rows to be returned in 'limited' clusters,where LIMIT says how many, and OFFSET (optional) specifies the number of rows to skip

-- Most database platforms provide string functions that can be useful for working with string data. In addition to string functions, string concatenation is also usually supported, which allows us to build complete sentences if necessary.

-- Aggregate functions provide the ability to COUNT, SUM, and AVG, as well as determine MIN and MAX. Only returns a single row of value(s) unless used with GROUP BY.

-- Counts the number of rows in the city table

-- Also counts the number of rows in the city table

-- Gets the SUM of the population field in the city table, as well as
-- the AVG population, and a COUNT of the total number of rows.

-- Gets the MIN population and the MAX population from the city table.

-- Using a GROUP BY with aggregate functions allows us to summarize information for a specific column. For instance, we are able to determine the MIN and MAX population for each countrycode in the city table.
