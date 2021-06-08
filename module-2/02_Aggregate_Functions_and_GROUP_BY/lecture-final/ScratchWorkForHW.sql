SELECT MAX(population), countrycode
FROM city 
WHERE countrycode IN (SELECT code FROM country GROUP BY code ORDER BY code)
GROUP BY population, countrycode
ORDER BY MAX(population) DESC;
--I'm unsure how to return only one largest city for each country code...
--For example IND should only appear once


Select countrycode, population
FROM city
Group BY countrycode, population
ORDER BY MAX(population) DESC;

Select MAX(population), name, countrycode
FROM city
GROUP BY name, population, countrycode
ORDER BY population DESC;

SELECT MAX(population) AS population_of_largest_city, country.code 
FROM city WHERE countrycode IN (SELECT country.code  FROM code)
GROUP BY countrycode, population
ORDER BY MAX(population) DESC;

SELECT code
FROM country;
