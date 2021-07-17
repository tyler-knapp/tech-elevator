/*
    DO NOT REMOVE OR CHANGE ANY EXISTING CODE (including the html).  
    Comments exist in all locations new code is needed, describing what is needed.
*/

let parent;
let cities = [];

document.addEventListener('DOMContentLoaded', () => {
    getCities();
    parent = document.getElementById('cityList');

    const showAll = document.getElementById('showAll')
    showAll.addEventListener('click',  () => {
        showAllCities();

    });

    // document.addEventListener

    /*
        Add an Event here so when the Show All button is clicked the
        showAllCities() method is called.
    */

    
document.getElementById('showFiltered').addEventListener('click', () => {
    showFilterCities();
});

    /*
        Add an Event here so when the Filter button is clicked the 
        showFilteredCities() method is called.
    */



});



function showAllCities() {
    removeAllCities();


    cities.forEach( (city) => {
        addCity(city.name, city.district, city.countrycode, city.population);

    });

    /*
        Add Code that calls the addCity() method for each city object 
        in the city array.) 
        
        The add City method takes the following arguments for the city:
            cityName
            cityDistrict
            cityCountryCode
            cityPopulation   
    */
}


<<<<<<< HEAD
function showFilterCities() {
    removeAllCities();

    const filter = document.getElementById('filter').value;

    const filteredCities = cities.filter( city => {
        return city.name.startsWith(filter);
    });
=======
}
>>>>>>> a11a5e3649e8250b12b93409aa51a31d136bbdc5

    console.table(filteredCities);

    filteredCities.forEach( (city) => {
        addCity(city.name, city.district, city.countrycode, city.population);

    });

    /*
        Add Code that does the following:
            1. Gets the value the user entered in the Starts With text field
            2. Uses that value to create a new array of cities that only contain
               cities that have a name that starts with that value
            3. For every city in the new list call the addCity() method with the
               appropriate values for that city
        
        The add City method takes the following arguments for the city:
            cityName
            cityDistrict
            cityCountryCode
            cityPopulation   
    */

    // STEP 1: get the value from the Starts with Text field
  

    // STEP 2: create the new array of cities for cities that start with that value


    // STEP 3: Call addCity() for every city in the new array
 



}









/*
    ---------- DO NOT CHANGE ANYTHING BELOW THIS LINE ----------
*/

function addCity(cityName, cityDistrict, cityCountry, cityPopulation) {

    const mainDiv = document.createElement('div');
    mainDiv.classList.add('city');
   
    const h2 = document.createElement('h2');
    h2.innerText = cityName;
    mainDiv.appendChild(h2);

    const location = document.createElement('p');
    const district = document.createElement('span');
    district.innerText = cityDistrict;
    location.appendChild(district);

    const country = document.createElement('span');
    country.innerText = `, ${cityCountry}`;
    location.appendChild(country);

    mainDiv.appendChild(location);

    const population = document.createElement('p');
    population.innerText = `Population: ${cityPopulation}`;
    mainDiv.appendChild(population);

    parent.appendChild(mainDiv);
}

function removeAllCities() {
    while (parent.firstChild) {
        parent.removeChild(parent.firstChild);
    }
}





