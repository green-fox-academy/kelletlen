-- Database of movie-rating website
/* Delete the tables if they already exist */
drop table if exists Movie;
drop table if exists Reviewer;
drop table if exists Rating;

/* Create the schema for our tables */
create table Movie
(
    mID      int,
    title    text,
    year     int,
    director text
);
create table Reviewer
(
    rID  int,
    name text
);
create table Rating
(
    rID        int,
    mID        int,
    stars      int,
    ratingDate date
);

/* Populate the tables with our data */
insert into Movie
values (101, 'Gone with the Wind', 1939, 'Victor Fleming');
insert into Movie
values (102, 'Star Wars', 1977, 'George Lucas');
insert into Movie
values (103, 'The Sound of Music', 1965, 'Robert Wise');
insert into Movie
values (104, 'E.T.', 1982, 'Steven Spielberg');
insert into Movie
values (105, 'Titanic', 1997, 'James Cameron');
insert into Movie
values (106, 'Snow White', 1937, null);
insert into Movie
values (107, 'Avatar', 2009, 'James Cameron');
insert into Movie
values (108, 'Raiders of the Lost Ark', 1981, 'Steven Spielberg');

insert into Reviewer
values (201, 'Sarah Martinez');
insert into Reviewer
values (202, 'Daniel Lewis');
insert into Reviewer
values (203, 'Brittany Harris');
insert into Reviewer
values (204, 'Mike Anderson');
insert into Reviewer
values (205, 'Chris Jackson');
insert into Reviewer
values (206, 'Elizabeth Thomas');
insert into Reviewer
values (207, 'James Cameron');
insert into Reviewer
values (208, 'Ashley White');

insert into Rating
values (201, 101, 2, '2011-01-22');
insert into Rating
values (201, 101, 4, '2011-01-27');
insert into Rating
values (202, 106, 4, null);
insert into Rating
values (203, 103, 2, '2011-01-20');
insert into Rating
values (203, 108, 4, '2011-01-12');
insert into Rating
values (203, 108, 2, '2011-01-30');
insert into Rating
values (204, 101, 3, '2011-01-09');
insert into Rating
values (205, 103, 3, '2011-01-27');
insert into Rating
values (205, 104, 2, '2011-01-22');
insert into Rating
values (205, 108, 4, null);
insert into Rating
values (206, 107, 3, '2011-01-15');
insert into Rating
values (206, 106, 5, '2011-01-19');
insert into Rating
values (207, 107, 5, '2011-01-20');
insert into Rating
values (208, 104, 3, '2011-01-02');

SELECT title
from Movie
WHERE director = "Steven Spielberg";
SELECT year
from movie
         inner join rating on movie.mID = rating.mID
where rating.stars between 4 and 5
group by movie.year;
SELECT title
from movie
where mID not in (select mID from rating);
SELECT name
from reviewer
         inner join rating on reviewer.rID = rating.rID
where ratingDate IS NULL;
SELECT name, title, stars, ratingDate
from movie
         inner join rating on movie.mID = rating.mID
         inner join reviewer on rating.rID = reviewer.rID
order by name ASC;
SELECT name, title, stars, ratingDate
from movie
         inner join rating on movie.mID = rating.mID
         inner join reviewer on rating.rID = reviewer.rID
order by title ASC;
SELECT name, title, stars, ratingDate
from movie
         inner join rating on movie.mID = rating.mID
         inner join reviewer on rating.rID = reviewer.rID
order by stars ASC;
SELECT name, title
from movie
         inner join rating on movie.mID = rating.mID
         inner join reviewer on rating.rID = reviewer.rID
group by name, title
having count(*) > 1;
SELECT rID
from rating
group by rID
having count(rID) > 1;
SELECT title, MAX(stars)
from movie
         inner join rating on movie.mID = rating.mID
group by title
order by title;
SELECT title, abs(MAX(stars) - MIN(stars)) AS spread
from movie
         inner join rating on movie.mID = rating.mID
order by spread DESC;
/*itt az kell, hogy ugyanannak a filmnek az értékeléseit nézze, ne a legnagyobb és a legkissebb érték különbségét*/






