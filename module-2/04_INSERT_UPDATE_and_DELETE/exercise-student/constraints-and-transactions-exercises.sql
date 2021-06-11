-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
SELECT *
FROM actor;

INSERT INTO actor(actor_id, first_name, last_name)
VALUES (201, 'HAMPTON', 'AVENUE');

INSERT INTO actor(actor_id, first_name, last_name)
VALUES (202, 'LISA', 'BYWAY');

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
SELECT * FROM film WHERE film_id = 1001;

INSERT INTO film(film_id, title, description, release_year, language_id, original_language_id, rental_duration, rental_rate, length, replacement_cost, rating)
VALUES(1001, 'EUCLIDEAN PI', 'The epic story of Euclid as a pizza delivery boy in
-- ancient Greece', 2008, 1, null, 6, 5.99, 198, 19.99, 'PG-13');
--Should I have left most of the fields omitted? eg. rental_rate, replacement_cost etc?
 
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
SELECT * FROM film_actor WHERE actor_id = 201 OR actor_id = 202;

INSERT INTO film_actor(actor_id, film_id)
VALUES(201, 1001);

INSERT INTO film_actor(actor_id, film_id)
VALUES(202, 1001);

-- 4. Add Mathmagical to the category table.
SELECT * FROM category WHERE category_id = 17;

INSERT INTO category(category_id, name)
VALUES (17, 'Mathmagical');

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
SELECT * FROM film WHERE title = 'EUCLIDEAN PI'
OR title ='EGG IGBY'
OR title ='KARATE MOON'
OR title = 'RANDOM GO'
OR title = 'YOUNG LANGUAGE';

SELECT * FROM film_category WHERE category_id = 17;

UPDATE film_category
SET category_id = 17
WHERE film_id = 274 OR film_id = 494 OR film_id = 714 OR film_id = 996 OR film_id = 1001;

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

UPDATE film
SET rating = 'G'
WHERE film_id = 274 OR film_id = 494 OR film_id = 714 OR film_id = 996 OR film_id = 1001;

-- 7. Add a copy of "Euclidean PI" to all the stores.
SELECT *
FROM inventory WHERE film_id = 1001;

INSERT INTO inventory(inventory_id, film_id, store_id)
VALUES (4583, 1001, 1);

INSERT INTO inventory(inventory_id, film_id, store_id)
VALUES (4582, 1001, 2);

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>


-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
