-- SELECT ... FROM
-- Selecting the names for all countries
SELECT name                --SELECT columns filters the columns to be returned
FROM country;           -- FROM is the table to get the data from

-- Selecting the name and population of all countries
SELECT   name, population
FROM country;

-- Selecting all columns from the city table
SELECT *                --* returns every column
FROM city;

SELECT DISTINCT district        --DISTINCT with a column will only return the unique vales from that colum
FROM city;

SELECT name AS city_name -- AS can alias a column so it has a different name in the results
FROM city;

-- SELECT ... FROM ... WHERE
-- Selecting the cities in Ohio
SELECT * 
FROM city
WHERE district = 'Ohio';

-- Selecting countries that gained independence in the year 1776
SELECT *
FROM country
WHERE indepyear = 1776;

-- Selecting countries not in Asia
SELECT *
FROM country
WHERE continent != 'Asia';

-- Selecting countries that do not have an independence year
SELECT *
FROM country
WHERE indepyear IS NULL;

-- Selecting countries that do have an independence year
SELECT *
FROM country
WHERE indepyear IS NOT NULL;

-- Selecting countries that have a population greater than 5 million
SELECT *
FROM country
WHERE population > 5000000;


-- SELECT ... FROM ... WHERE ... AND/OR
-- Selecting cities in Ohio and Population greater than 400,000
SELECT *
FROM city
WHERE district = 'Ohio'
AND population > 400000;

-- Selecting country names on the continent North America or South America

SELECT *
FROM country
WHERE continent = 'North America'
OR continent = 'South America';

--The above query could also be written as
SELECT name
FROM country
WHERE continent IN ('North America' , 'South America');

--Between allows a selection between two values 
SELECT *
FROM country
WHERE population BETWEEN 1000000 AND 2000000;

--Select all countries that begin with the letter A
SELECT *
FROM country
WHERE name LIKE 'A%';

--Select all countries that end with the letter d
SELECT *
FROM country
WHERE name Like '%d';

--Select all countries that contain la
SELECT *
FROM country
WHERE name LIKE '%la%';

--LIKE is case sensitive, ILIKE is not case sensitive (ILIKE is Postgres only)
SELECT *
FROM country 
WHERE name ILIKE '%d%';

-- SELECTING DATA w/arithmetic
-- Selecting the population, life expectancy, and population per area
--	note the use of the 'as' keyword
SELECT population, lifeexpectancy, (population / surfacearea) AS population_density
FROM country;


