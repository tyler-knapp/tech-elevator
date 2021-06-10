-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)
SELECT title, first_name, last_name
FROM actor
JOIN film_actor ON actor.actor_id = film_actor.actor_id
JOIN film ON film_actor.film_id = film.film_id
WHERE last_name = 'STALLONE' AND first_name ='NICK';
-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)
SELECT title, (last_name|| ', ' ||first_name) AS last_first
FROM actor
JOIN film_actor ON actor.actor_id = film_actor.actor_id
JOIN film ON film_actor.film_id = film.film_id
WHERE last_name ='REYNOLDS';

-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)
SELECT title, (last_name || ', ' || first_name) AS last_first
FROM actor
JOIN film_actor ON actor.actor_id = film_actor.actor_id
JOIN film ON film_actor.film_id = film.film_id
WHERE last_name = 'DEAN';

-- 4. All of the the ‘Documentary’ films
-- (68 rows)
SELECT *
FROM category
JOIN film_category ON category.category_id = film_category.category_id
JOIN film ON film_category.film_id = film.film_id
WHERE name = 'Documentary';

-- 5. All of the ‘Comedy’ films
-- (58 rows)
SELECT *
FROM category
JOIN film_category ON category.category_id = film_category.category_id
JOIN film ON film_category.film_id = film.film_id
WHERE name = 'Comedy';

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)
SELECT name, title, rating
FROM category
JOIN film_category ON category.category_id = film_category.category_id
JOIN film ON film_category.film_id = film.film_id
WHERE name = 'Children'
AND rating = 'G';

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows
SELECT name, title, rating, length
FROM category
JOIN film_category ON category.category_id = film_category.category_id
JOIN film ON film_category.film_id = film.film_id
WHERE name = 'Family'
AND rating = 'G'
AND length < 120;
-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)
SELECT title, rating, (last_name|| ', ' ||first_name) AS last_first
FROM actor
JOIN film_actor ON actor.actor_id = film_actor.actor_id
JOIN film ON film_actor.film_id = film.film_id
WHERE last_name = 'LEIGH'
AND film.rating = 'G';

-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)
SELECT name, title, film.release_year
FROM category
JOIN film_category ON category.category_id = film_category.category_id
JOIN film ON film_category.film_id = film.film_id
WHERE name ='Sci-Fi'
AND film.release_year =2006;

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)
SELECT title, name, last_name|| ', ' ||first_name AS last_first
FROM actor
JOIN film_actor ON actor.actor_id = film_actor.actor_id
JOIN film ON film_actor.film_id = film.film_id
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE last_name = 'STALLONE'
AND category.name ='Action';

-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)
SELECT address, city, district, country
FROM store
JOIN address ON store.address_id = address.address_id
JOIN city ON address.city_id = city.city_id
JOIN country ON city.country_id = country.country_id;

-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)
SELECT (last_name|| ', '||first_name) AS manager_last_first, store.store_id, address.address
FROM store
JOIN staff ON store.manager_staff_id = staff.staff_id
JOIN address ON store.address_id = address.address_id
ORDER BY store_id;

-- 13. The first and last name of the top ten customers ranked by number of rentals
-- (#1 should be “ELEANOR HUNT�? with 46 rentals, #10 should have 39 rentals)
SELECT count(*) AS number_of_rentals, customer.last_name, customer.first_name
FROM customer
JOIN rental ON customer.customer_id = rental.customer_id
GROUP BY customer.last_name, customer.first_name
ORDER BY number_of_rentals DESC
LIMIT 10;

-- 14. The first and last name of the top ten customers ranked by dollars spent
-- (#1 should be “KARL SEAL�? with 221.55 spent, #10 should be “ANA BRADLEY�? with 174.66 spent)
SELECT customer.customer_id, (customer.last_name|| ', ' || customer.first_name) AS last_first, SUM(payment.amount) AS total_amount_spent
FROM customer
JOIN payment ON customer.customer_id = payment.customer_id
GROUP BY customer.customer_id
ORDER BY total_amount_spent DESC
LIMIT 10;

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store.
-- (NOTE: Keep in mind that while a customer has only one primary store, they may rent from either store.)
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)
SELECT store.store_id, address.address, count(payment.amount), SUM(payment.amount), AVG(payment.amount) 
FROM rental
JOIN payment ON rental.rental_id = payment.rental_id
JOIN inventory ON rental.inventory_id = inventory.inventory_id
JOIN store ON inventory.store_id = store.store_id
JOIN address ON store.address_id = address.address_id
GROUP BY store.store_id, address.address;


-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD�? with 34 rentals and #10 should have 31 rentals)
SELECT inventory.film_id, title, count(*)
FROM film
JOIN inventory ON film.film_id = inventory.film_id
JOIN rental ON inventory.inventory_id = rental.inventory_id
GROUP BY inventory.film_id, title
ORDER BY count DESC
LIMIT 10;

-- 17. The top five film categories by number of rentals
-- (#1 should be “Sports�? with 1179 rentals and #5 should be “Family�? with 1096 rentals)
--SELECT customer_id
--FROM rental;

SELECT category.category_id, name , count(*) AS number_of_rentals
FROM category
JOIN film_category ON category.category_id = film_category.category_id
JOIN film ON film_category.film_id = film.film_id
JOIN inventory ON film.film_id = inventory.film_id
JOIN rental ON inventory.inventory_id = rental.inventory_id
GROUP BY category.category_id, name 
ORDER BY number_of_rentals DESC
LIMIT 5;

-- 18. The top five Action film titles by number of rentals
-- (#1 should have 30 rentals and #5 should have 28 rentals)
SELECT film.title, name , count(*) AS number_of_rentals
FROM category
JOIN film_category ON category.category_id = film_category.category_id
JOIN film ON film_category.film_id = film.film_id
JOIN inventory ON film.film_id = inventory.film_id
JOIN rental ON inventory.inventory_id = rental.inventory_id
WHERE name ='Action'
GROUP BY film.title, name 
ORDER BY number_of_rentals DESC
LIMIT 5;

-- 19. The top 10 actors ranked by number of rentals of films starring that actor
-- (#1 should be “GINA DEGENERES�? with 753 rentals and #10 should be “SEAN GUINESS�? with 599 rentals)
SELECT actor.actor_id, (first_name|| ', '|| last_name) AS last_first, count(*) AS number_of_rentals
FROM actor
JOIN film_actor ON actor.actor_id = film_actor.actor_id
JOIN film ON film_actor.film_id = film.film_id
JOIN inventory ON film.film_id = inventory.film_id
JOIN rental ON inventory.inventory_id = rental.inventory_id
GROUP BY actor.actor_id, last_first
ORDER BY number_of_rentals DESC
LIMIT 10;

-- 20. The top 5 “Comedy�? actors ranked by number of rentals of films in the “Comedy�? category starring that actor
-- (#1 should have 87 rentals and #5 should have 72 rentals)
SELECT actor.actor_id, (first_name|| ', '|| last_name) AS last_first, count(*) AS number_of_rentals, category.name
FROM actor
JOIN film_actor ON actor.actor_id = film_actor.actor_id
JOIN film ON film_actor.film_id = film.film_id
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
JOIN inventory ON film.film_id = inventory.film_id
JOIN rental ON inventory.inventory_id = rental.inventory_id
WHERE category.name = 'Comedy'
GROUP BY actor.actor_id, last_first, category.name
ORDER BY number_of_rentals DESC
LIMIT 5;