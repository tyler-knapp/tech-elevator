package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

		System.out.println(birdsRemaining);

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numberOfRaccoonsPlayingInWoods = 3;
		int numberOfRaccoonsEatingDinner = 2;
		int raccoonsLeftInWoods = numberOfRaccoonsPlayingInWoods - numberOfRaccoonsEatingDinner;

		 System.out.println(raccoonsLeftInWoods);


        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */

		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int totalOfBeesAndFlowers = numberOfFlowers - numberOfBees;

		System.out.println(totalOfBeesAndFlowers);

        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */

		int lonelyPigeonEatingBreadcrumbs = 1;
		int anotherPigeonEatingBreadcrumbs = 1;
		int totalNumberOfPigeonsEatingBreadcrumbs = lonelyPigeonEatingBreadcrumbs + anotherPigeonEatingBreadcrumbs;

		System.out.println(totalNumberOfPigeonsEatingBreadcrumbs);


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */

		int owlsSittingOnTheFence = 3;
		int additionalOwls = 2;
		int totalOwlsOnTheFence = owlsSittingOnTheFence + additionalOwls;

		System.out.println(totalOwlsOnTheFence);




        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */

		int beaversWorkingOnHome = 2;
		int beaversGoingOnSwim = 1;
		int totalBeaversWorking = beaversWorkingOnHome - beaversGoingOnSwim;

		System.out.println(totalBeaversWorking);


        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */

		int toucansSittingOnTree = 2;
		int toucansJoiningOnTree = 1;
		int totalToucansOnTree = toucansSittingOnTree + toucansJoiningOnTree;

		System.out.println(totalToucansOnTree);

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */

		int squirrelsInTree = 4;
		int numberOfNuts = 2;
		int differenceBetweenSquirrelsAndNuts = squirrelsInTree - numberOfNuts;

		System.out.println(differenceBetweenSquirrelsAndNuts);


        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */

		double foundQuarterInDollars = 0.25;
		double foundDimeInDollars = 0.10;
		double foundNickelInDollars = 0.10;
		double totalFoundInDollars = foundDimeInDollars + foundNickelInDollars + foundQuarterInDollars;

		System.out.println(totalFoundInDollars);


        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */

		int brierClassMuffinTotal = 18;
		int macadamsClassMuffinTotal = 20;
		int flanneryClassMuffinTotal = 17;
		int firstGradeClassesMuffinTotal = brierClassMuffinTotal + macadamsClassMuffinTotal + flanneryClassMuffinTotal;

		System.out.println(firstGradeClassesMuffinTotal);

        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */

		double yoyoCostInDollars = .24;
		double whistleCostInDollars = .14;
		double totalSpentInDollars= yoyoCostInDollars + whistleCostInDollars;

		System.out.println(totalSpentInDollars);


        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */

		int totalRiceKristpieTreats = 5;
		int totalLargeMarshmallows = 8;
		int totalMiniMarshmallows = 10;

		int totalMarshmallowsUsed = totalLargeMarshmallows + totalMiniMarshmallows;

		System.out.println(totalMarshmallowsUsed);



        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */

		int snowReceivedAtHiltsInInches = 29;
		int snowReceivedAtBrecknockElementaryInInches = 17;

		int differenceInSnowReceivedInInches = snowReceivedAtHiltsInInches - snowReceivedAtBrecknockElementaryInInches;

		System.out.println(differenceInSnowReceivedInInches);


        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */

		int hiltTotalInDollars = 10;
		int toyTruckCostInDollars = 3;
		int pencilCaseCostInDollars = 2;

		double newHiltTotalInDollars = hiltTotalInDollars - (toyTruckCostInDollars + pencilCaseCostInDollars);


        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */

		int joshMarbleCollectionTotal = 16;
		int lostMarbles = 7;

		int differenceInMarbleCollection = joshMarbleCollectionTotal - lostMarbles;



        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */

		int seashellsInCollection = 19;
		int seashellCollectionGoal = 25;
		int seashellsNeededToReachGoal = seashellCollectionGoal - seashellsInCollection;



        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */

		int balloonsBradHas = 17;
		int redBalloonsTotal = 8;
		int greenBalloonTotal = balloonsBradHas - redBalloonsTotal;


        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */

		int booksOnShelf = 38;
		int additionalBooksPutOnShelf = 10;
		int totalBooksOnShelf = booksOnShelf + additionalBooksPutOnShelf;



        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

		int numberOfLegsOnBee = 6;
		int totalNumberOfBees = 8;
		int totalNumberOfLegs = totalNumberOfBees * numberOfLegsOnBee;



        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */

		double iceCreamCostInDollars = 0.99;
		int totalIceCreamCones = 2;
		double totalCostOfIceCream = iceCreamCostInDollars * totalIceCreamCones;



        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */

		int rocksNeededToCompleteBorder = 125;
		int rocksInHiltsPossession = 64;

		int additionalRocksNeededToCompleteBorder = rocksNeededToCompleteBorder - rocksInHiltsPossession;


        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */

		int hiltMarbles = 38;
		int hiltLostMarbles = 15;

		int hiltTotalMarbles = hiltMarbles - hiltLostMarbles;



        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

		int totalDistanceToConcertInMiles = 78;
		int distanceToGasStationInMiles = 32;

		int distanceLeftToConcertInMiles = totalDistanceToConcertInMiles - distanceToGasStationInMiles;



        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */

		int timeSpentShovelingSnowSaturdayMorningInMinutes = 90;
		int timeSpentShovelingSnowSaturdayAfternoonInMinutes = 45;
		int totalTimeShovelingSnowInMinutes = timeSpentShovelingSnowSaturdayAfternoonInMinutes + timeSpentShovelingSnowSaturdayMorningInMinutes;



        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */

		int numberOfHotDogs = 6;
		double costOfHotDogsInDollars = .5;
		double totalSpentOnHotDogsInDollars = numberOfHotDogs * costOfHotDogsInDollars;




        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */

		int totalInCents = 50;
		int costOfPencilInCents = 7;

		int pencilsAbleToBeBought = totalInCents / costOfPencilInCents;

        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */

		int butterfliesSeen = 33;
		int orangeButterflies = 20;

		int redButterflies = butterfliesSeen - orangeButterflies;



        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

		double katesPaymentInDollars = 1.00;
		double candyCostInDollars = .54;

		double katesChangeReceivedInDollars = katesPaymentInDollars - candyCostInDollars;



        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */

		int treesInBackyard = 13;
		int treesPlanted = 12;

		int totalNumberOfTrees = treesInBackyard + treesPlanted;



        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */

		int hoursInADay = 24;
		int daysUntilJoySeesHerGrandma = 2;

		int hoursUntilJoySeesHerGrandma = hoursInADay * daysUntilJoySeesHerGrandma;


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */

		int numberOfCousins = 4;
		int piecesOfGumPerCousin = 5;

		int totalPiecesOfGum = numberOfCousins * piecesOfGumPerCousin;



        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */

		double moneyDanHasInDollars = 3.00;
		double costOfCandyBarInDollars = 1.00;
		double moneyLeftOverFromSaleInDollars = moneyDanHasInDollars - costOfCandyBarInDollars;


        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsInLake = 5;
		int peoplePerBoat = 3;

		int peopleOnBoatsInLake = boatsInLake * peoplePerBoat;



        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */

		int legosEllenHad = 380;
		int legosEllenLost = 57;

		int totalLegosEllenHas = legosEllenHad - legosEllenLost;



        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */

		int numberOfBakedMuffins = 35;
		int bakedMuffinGoal = 83;

		int muffinsNeededToReachGoal = bakedMuffinGoal - numberOfBakedMuffins;


        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

		int crayonsWillieHas = 1400;
		int crayonsLucyHas = 290;

		int differenceInCrayonsTotals = crayonsWillieHas - crayonsLucyHas;

        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersPerPage = 10;
		int pagesOfStickers = 22;

		int totalNumberOfStickers = stickersPerPage * pagesOfStickers;

        /* Exercise 39
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */

		int numberOfChildren = 8;
		int numberOfCupcakes = 96;

		double numberOfCupcakesPerChild = numberOfCupcakes / numberOfChildren;

        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */

		int gingerbreadCookiesToBeDistributed = 47;
		int cookiesPerJar = 6;

		int leftOverCookies = gingerbreadCookiesToBeDistributed % cookiesPerJar;


        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

		int preparedCroissants = 59;
		int numberOfNeighbors = 8;

		int leftOverCroissants = preparedCroissants % numberOfNeighbors;


        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */

		int oatmealCookiesPerTray = 12;
		int oatmealCookieTotal = 276;
		int numberOfTraysNeeded = oatmealCookieTotal / oatmealCookiesPerTray;


        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int bitSizedPretzelsMade = 480;
		int pretzelsPerServing = 12;

		int totalNumberOfServingsPrepared =  bitSizedPretzelsMade / pretzelsPerServing;


        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */

		int lemonCupcakesForChildrenInOrphanage = 53;
		int lemonCupcakesLeftAtHome = 2;
		int lemonsCupcakesPerBox = 3;

		int boxesOfCupcakesGivenAway = (lemonCupcakesForChildrenInOrphanage - lemonCupcakesLeftAtHome) / lemonsCupcakesPerBox;


        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotSticksForBreakfast = 74;
		int numberOfPeopleServed = 12;

		int carrotSticksLeftUneaten = carrotSticksForBreakfast % numberOfPeopleServed;

        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int teddyBearsPlacedOnShelf = 98;
		int maxNumberOfTeddyBearsPerShelf = 7;

		int numberOfShelvesFilledWithTeddyBears = teddyBearsPlacedOnShelf / maxNumberOfTeddyBearsPerShelf;


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int picturesPerAlbum = 20;
		int totalNumberOfPictures = 480;

		int numberOfAlbumsNeeded = totalNumberOfPictures / picturesPerAlbum;


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

		int tradingCardsInJoesRoom = 94;
		int maxNumberOfCardsPerBox = 8;

		int numberOfBoxesFilled = tradingCardsInJoesRoom / maxNumberOfCardsPerBox;

		int cardLeftInUnfilledBox = tradingCardsInJoesRoom % maxNumberOfCardsPerBox;


        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

		int booksToBeDistributedEqually = 210;
		int numberOfRepairedShelves = 10;

		int numberOfBooksPerShelf = booksToBeDistributedEqually / numberOfRepairedShelves;


        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

		int numberOfBakedCroissants = 17;
		int numberOfGuests = 7;

		double numberOfBakedCroissantsPerGuest = (double) numberOfBakedCroissants / numberOfGuests;


	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */

		int squareFootageOfRoom = 12 * 14;

		int numberOfRooms = 5;

		double hoursForBillToCompleteRoom = 2.15;

		double squareFootageBillCanCompletePerHour = squareFootageOfRoom / hoursForBillToCompleteRoom;

		double hoursForJillToCompleteRoom = 1.90;

		double squareFootageJillCanCompletePerHour = squareFootageOfRoom / hoursForJillToCompleteRoom;

		double combinedHourlyRate = squareFootageJillCanCompletePerHour + squareFootageBillCanCompletePerHour;

		int totalWallsSquareFootage = numberOfRooms * squareFootageOfRoom;

		double timeToCompletePaintingAllRooms = totalWallsSquareFootage / combinedHourlyRate;


	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Grace";
		String lastName = "Hopper";
		String middleInitial = "B";

		String fullName = lastName + ", " + firstName + " " + middleInitial + ".";


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		double distanceBetweenNewYorkAndChicago = 800.00;
		double distanceAlreadyTraveledByTrain = 537.00;
		double unitConversionDecimalToPercentage = 100.00;
		double percentageOfTripCompleted = (distanceAlreadyTraveledByTrain / distanceBetweenNewYorkAndChicago) * unitConversionDecimalToPercentage;

		int percentageOfTripCompletedAsAWholeNumber = (int) percentageOfTripCompleted;

		System.out.println(percentageOfTripCompleted);
		System.out.println(percentageOfTripCompletedAsAWholeNumber);
	}

}
