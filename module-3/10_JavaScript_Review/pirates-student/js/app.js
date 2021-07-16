/*
* Add Events and functions to move the Ship and Win the game
*/

// Creates the Grid -- this should only occur after the DOM loads
document.addEventListener('DOMContentLoaded', () => {
    createGrid();

    document.querySelector('body').addEventListener('keydown', (eventObj) => {
        if(eventObj.key === 'ArrowRight'){
            moveShipRight();
        }
        if(eventObj.key === 'ArrowLeft'){
            moveShipLeft();
        }
        if(eventObj.key === 'ArrowDown'){
            moveShipDown();
        }
        if(eventObj.key === 'ArrowUp'){
            moveShipUp();
        }
    });

    document.getElementById('resetButton').addEventListener('click', (event) => {
        resetGame();
        event.preventDefault();
    });
});

function moveShipRight() {
    const ship = getShipLocation();
    const right = ship.nextElementSibling;
    moveShipDown(ship, right);

}

function moveShipLeft(){
    const ship = getShipLocation();
    const left = ship.previousElementSibling;
    moveShipDown(ship, left);
    
}

function moveShipDown(){
    const ship = getShipLocation();
    const down = getElementAtSameIndex(ship, ship.parentElement.nextElementSibling);
    moveShip(ship, down);
}

function moveShipUp(){
    const ship = getShipLocation();
    const up = getElementAtSameIndex(ship, ship.parentElement.previousSibling);
    moveShip(ship, up);
}

function canMoveToElement(element){
    if(element == null || element.classList.contains('pirate') || element.classList.contains('iceberg')){
        return false;
    }
    return true;
}
    

function getElementAtSameIndex(ship, newParent){
    let elementAtIndex = null;
    if(newParent != null){
        const index = Array.from(ship.parentNode.children).indexOf(ship);
        elementAtIndex = newParent.childNodes[index];
    }
}

function moveShip(shipElement, newElement){
    shipElement.classList.remove('boat');
    newElement.classList.add('boat');
}


function canWin(nextElement){
    if(nextElement.classList.contains('treasure')){
        return true;
    }
    return false;
}

function getShipLocation() {
    return document.getElementById('frame').querySelector('.boat');
}


function win(){
    const announce = document.querySelector('.announce');
    announce.classList.add('winText');
    announce.innerText ="Winner!"
}
/**
 * Reset the Game
 */
function resetGame() {

    // Create the Obstacles
    createObstacles();

    const boat = getShipLocation();
    if(boat != null){
        boat.classList.remove('boat');
    }
    
 
    // Inform the user they can start
    document.querySelector('.announce').innerText = "Play!";


   // Set the starting location of the boat and treasure
   const frame = document.getElementById('frame');
   frame.firstElementChild.firstElementChild.classList.add('boat');
   frame.lastElementChild.lastElementChild.classList.add('treasure');

}


/**
 * Creates the game grid
 */
function createGrid() {

    const frame = document.getElementById('frame');

    // Add Code to create the game grid
    for (let i = 0; i < 10 ; i++) {
        buildRow(frame); 
    }
    resetGame();
}

/**
 * Builds the grid rows
 * @param {HTMLElement} frame 
 */
function buildRow(frame) {
    const row = document.createElement('div');
    row.classList.add('row');
    frame.appendChild(row);
    for (let i = 0; i < 10 ; i++) {
        buildSquare(row, i); 
    }    
}

/**
 * Builds the grid squares 
 * @param {HTMLElement} row 
 * @param {int} count 
 */
function buildSquare(row, count) {
   const square = document.createElement('div');
   square.classList.add('square');
   row.insertAdjacentElement('beforeend', square);
    
}


function createObstacles(){
//const rows = document.querySelectorAll('#frames .row');

const rows = document.getElementById('frame').children;

const rowsArray = Array.from(rows);

rowsArray.forEach( (row, rowIndex) => {

    const cells = row.children;
    Array.from(cells).forEach( (cell, cellIndex) => {
        if( !(rowIndex === 0 && cellIndex === 0) &&
        !(rowIndex === rows.length - 1 && cellIndex === cells.length -1)
        ){
            addObstacles(cell);
        }

    });

});
}

/**
 * Adds random obstacles to a game cell
 * 
 * @param {HTMLElement} cell 
 */
function addObstacles(cell) {
    // remove any existing pirates or icebergs
    cell.classList.remove('pirate');
    cell.classList.remove('iceberg');
 
    const rand = Math.floor(Math.random() * 100) + 1;

    if (rand > 85) {
        cell.classList.add('pirate');
    } else if (rand > 80) {
        cell.classList.add('iceberg');
    } 
}








