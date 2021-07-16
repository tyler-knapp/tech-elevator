// add pageTitle

// add groceries

const pageTitle = 'My Shopping List';
let groceries = ['apples', 'bananas', 'watermelon', 'milk', 'eggs', 'cheese', 'bread', 'noodles', 'steaks', 'cider'];


/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {}
const page = document.getElementById('title').innerHTML = pageTitle;




/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
const main = document.getElementById('groceries');

groceries.forEach( (item) => {
//Create li with the class grocery for each item in the grocery array
const container = document.createElement('li');
container.classList.add('grocery');
container.innerText = item;
//const grocery = document.querySelectorAll('grocery').innerHTML = item;
main.insertAdjacentElement('beforeend', container);

});

}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {

  groceries.forEach( (item) => {
    const container = document.querySelectorAll('li');
    container.classList.add('completed');

  });

  // for ( let i = 0 ; i < groceries.length ; i++){
  //   const container = document.querySelector('li');
  //   groceries[i].classList.add('completed');
  // }



}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
