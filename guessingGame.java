// Author: Aatma Patel
// Friday May 12, 2020
// Period 4
// ISC3U
// Unit 5 End of unit Assignment: Guessing Game

package Patel_Aatma_Guessing_Game;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static java.time.temporal.ChronoUnit.SECONDS;

@SuppressWarnings("unused")
public class guessingGame {

	static String[] funnyfortunes = { "No snowflake in an avalanche ever feels responsible.",

			"About time I got out of that cookie.",

			"If you eat something and noboady sees you eat it, it has no calories.",

			"I cannot help you, for I am just a cookie.",

			"You will become best friends with a professional athlete if competitive eating can be considered a sport.",

			"When stranded in the forest, you don't have to be faster than the bear, you just have to be faster than the slowest guy running from it.",

			"Ask not what your fortune cookie can do for you, but what you can do for your fortune cookie.",

			"I can't believe you're about to eat my tiny home.",

			"When you squeeze an orange, orange juice comes out - because that's what's inside.",

			"You are about to finish reading a fortune cookie", "There is no angry way to say bubbles.",

	"BTS is the best band in the whole universe!!!!!" };

	public static void main(String[] args) throws InterruptedException {

		Date currentDate = new Date();

		System.out.println(currentDate);

		HashMap<Integer, String> fluffyMonkeys = new HashMap<Integer, String>();
		// An unordered collection of integers and strings in this case!
		fluffyMonkeys.put(1, " 🙈 see no evil");

		fluffyMonkeys.put(2, " 🙉 hear no evil");

		fluffyMonkeys.put(3, " 🙊 speak no evil");

		fluffyMonkeys.put(4, " 🐵 do no evil");

		System.out.println(fluffyMonkeys);

		int number, numberGuess, points = 0, minNumber, maxNumber, attemptsLevelTwo = 0, attemptsLevelThree = 0, timer,
				millisecToSecConvert, computerTwoGuess = 0, attemptsLevelBonus = 0, computerOneGuess = 0,
				attemptsLevelFour = 0, computerPoints = 0, gameRate = 0, spinTheWheel, fortuneCookie;
		// Integer variables

		final int attemptsMax = 10;
		// final ensures the value of the integer does not change throughout the code

		long startTime, stopTime, totalTime;
		// Long variables

		String userName, userNumber;
		// String variables

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		// Enables one to scan input from the program (the console in this case)

		System.out.print("\nHello! Hello friend!" + "\nWhat is the name: ");
		// A println statement which writes the following sentence to the console
		userName = scan.next();
		// A function that returns the next input of the user as an integer

		System.out.println("\n" + userName + " welcome to a digital guessing game!"
				+ "\nPlease note that there are four levels to this game, and a bonus at the end.");

		System.out.println("Without further ado, let us begin!");
		// All the rules for each of the levels have been written in one place

		System.out.println("The rules for each level will be displayed as you play along:" + "\n\n1️⃣LEVEL ONE:"
				+ "\n\t1. The computer will generate a random number between 1-100"
				+ "\n\t2. You are to guess this number by inputting your guess into the console"
				+ "\n\t3. The computer will inform you if you are \"too low\" or \"too high\""
				+ "\n\t4. You have unlimited guesses until you get the number correct"
				+ "\n\t5. Afterwhich, you can move onto the next level!");
		// The rules for level one
		System.out.println(
				"\n2️⃣LEVEL TWO:" + "\n\t1. This time you are to input a range of values you want to guess from"
						+ "\n\t2. The computer will select a number from the range you have provided"
						+ "\n\t3. Your guessess will be counted and totalled at the end");
		// The rules for level two

		System.out.println("\n3️⃣LEVEL THREE:" + "\n\t1. You will have a maximum of 10 guesses"
				+ "\n\t2. If you guess correct before your tenth attempt you win this level"
				+ "\n\t3. If you fail to guess correctly by your tenth attempt the computer wins"
				+ "\n\t4. Your time will also be tracked, you will be awarded 10 points if you"
				+ "\n\t   complete the level before or at 20 seconds and will lose 5 points if you are above 20 seconds");
		// The rules for level three

		System.out.println("\n4️⃣LEVEL FOUR:"
				+ "\n\t1. You will swtich roles with the computer, the computer will guess your number"
				+ "\n\t2. You are to indicate if the guess is \"low\", \"high\" or \"correct\" to the computer"
				+ "\n\t3. You can trust that the computer will not cheat");
		// The rules for level four

		System.out.println("\n*️⃣BONUS LEVEL: " + "\n\t1. The computer will play against itself"
				+ "\n\t2. You will see all attempts, how long it takes, and total computer points as well"
				+ "\n\t3. Enjoy!");
		// The rules for the bonus one

		System.out.println(
				"\n______________________________________________________________________________________________________________");

		System.out.println("\n1️⃣LEVEL ONE:");
		// Level one begins

		 number = (int) (Math.random() * ((100 - 1) + 1)) + 1;

		do {
			// a do loop ensures the number roll doesn't go on infinitely and uncontrollably

			System.out.print("\n" + userName + " guess the number: ");

			numberGuess = scan.nextInt();

			if (numberGuess < number) {
				// An if-else statement that preforms actions outlined within the parenthesis
				// if the conditions are met
				System.out.println("Your guess is too low. Try again.");

				points--;
				// A prefix operator that counts the decrementing points by 1

			}

			else if (numberGuess > number) {

				System.out.println("Your guess is too high. Try again.");

				points -= 2;
				// A prefix operator that counts the decrementing points by 2

			}

		} while (numberGuess != number);
		{
			// the above code executes for when both numberGuess and number rolled by the
			// computer do not equal each other

			points += 100;

			System.out.println("\n\tSUMMARY:" + "\nYou have " + points + " point/points so far."
					+ "\nCongrats you have passed LEVEL ONE!");

			if (points == 100) {

				System.out.print("\nSince you have earned 100 points, you get a free spin on our spin the wheel."
						+ "\nSimply pick a number from 1-10 and you will get a reward: ");

				spinTheWheel = scan.nextInt();

				switch (spinTheWheel) {
				// A switch case selection statement that calculates the spin the wheel points
				// based on the
				// inputted number by the user
				case 1:
					points *= 10;
					System.out.println(userName + " your points are multiplied by 10. " + "\nOverall you have " + points
							+ " points.");
					// Multiplies the previously earned points by 10 and displays the new total to
					// the console
					break;

				case 2:
					points += 20;
					System.out.println(userName + " you are rewarded with another 20 points. " + "\nOverall you have "
							+ points + " points.");
					// Adds the previously earned points by 20 and displays the new total to the
					// console

					break;

				case 3:
					points *= 30;
					System.out.println(userName + " your points are multiplied by 30. " + "\nOverall you have " + points
							+ " points.");
					// Multiplies the previously earned points by 30 and displays the new total to
					// the console

					break;

				case 4:
					points += 40;
					System.out.println(userName + " you are rewarded with another 40 points. " + "\nOverall you have "
							+ points + " points.");
					// Multiplies the previously earned points by 40 and displays the new total to
					// the console

					break;

				case 5:
					points *= 50;
					System.out.println(userName + " your points are multiplied by 50. " + "\nOverall you have " + points
							+ " points.");
					// Multiplies the previously earned points by 50 and displays the new total to
					// the console

					break;

				case 6:
					points += 60;
					System.out.println(userName + " you are rewarded with another 60 points. " + "\nOverall you have "
							+ points + " points.");
					// Adds the previously earned points by 60 and displays the new total to the
					// console

					break;

				case 7:
					points *= 70;
					System.out.println(userName + " your points are multiplied by 70. " + "\nOverall you have " + points
							+ " points.");
					// Multiplies the previously earned points by 70 and displays the new total to
					// the console

					break;

				case 8:
					points += 80;
					System.out.println(userName + " you are rewarded with another 80 points. " + "\nOverall you have "
							+ points + " points.");
					// Adds the previously earned points by 80 and displays the new total to the
					// console

					break;

				case 9:
					points *= 90;
					System.out.println(userName + " your points are multiplied by 90. " + "\nOverall you have " + points
							+ " points.");
					// Multiplies the previously earned points by 90 and displays the new total to
					// the console

					break;

				case 10:
					points += 100;
					System.out.println(userName + " you are rewarded with another 100 points. " + "\nOverall you have "
							+ points + " points.");
					// Adds the previously earned points by 100 and displays the new total to the
					// console

					break;

				default:
					System.out.println("Not a valid number. You lose your free spin.");
					// The default case if the user does not enter a number between 1-10

					break;
				}

			}

		}
		// Level one ends
		System.out.println(
				"\n______________________________________________________________________________________________________________");

		System.out.println("\n2️⃣LEVEL TWO:");
		// Level two begins

		System.out.print("\n" + userName + " please enter the minimum number of the range: ");
		// Asks for the minimum number of the number range which will be used to
		// determine the number the user will guess

		minNumber = scan.nextInt();

		System.out.print("Enter the maximum number of the range: ");
		// Asks for the maximum number of the number range which will be used to
		// determine the number the user will guess

		maxNumber = scan.nextInt();

		number = (int) (Math.random() * ((maxNumber - minNumber) + 1)) + minNumber;
		// A random number is generated from the minimum and maximum numbers provided by
		// the user

		do {

			System.out.print("\n" + userName + " guess the number: ");

			numberGuess = scan.nextInt();

			if (numberGuess < number) {
				// An if-else selection statement which is executed when numberGuess is lower
				// than the number generated by the Math.random method

				System.out.println("Your guess is too low. Try again.");

				attemptsLevelTwo++;
				// A prefix that counts the attempts
				// This is incrementing by 1 each time

				points -= 2;
				// The points prefix which decrements by 2 each time the userGuess number is
				// lower than the Math.random number

			}

			else if (numberGuess > number) {
				// An if-else selection statement which is executed when numberGuess is higher
				// than the number generated by the Math.random method

				System.out.println("Your guess is too high. Try again.");

				attemptsLevelTwo++;

				points -= 4;
				// The points prefix which decrements by 4 each time the userGuess number is
				// higher than the Math.random number

			}

		} while (numberGuess != number);
		{

			attemptsLevelTwo++;

			points += 200;
			// If the userGuess is equal to Math.random method number the user earns 200
			// points

			System.out.println("\n\tSUMMARY:");

			if (attemptsLevelTwo >= 1) {

				System.out.println("You guessed " + attemptsLevelTwo + " time/times.");
				// A println statement which writes the total number of attempts made by the
				// user until they guessed the correct number

			}

			System.out.println("You now have " + points + " points." + "\nCongrats you have passed LEVEL TWO!");
			// A println statement which writes the total number of points earned by the
			// user at the end of Level two
			// Level two ends

		}

		System.out.println(
				"\n______________________________________________________________________________________________________________");

		System.out.println("\n3️⃣LEVEL THREE:");
		// Level three begins

		System.out.print("\n" + userName + " please enter the minimum number of the range: ");

		minNumber = scan.nextInt();

		System.out.print("Enter the maximum number of the range: ");

		maxNumber = scan.nextInt();

		number = (int) (Math.random() * ((maxNumber - minNumber) + 1)) + minNumber;

		System.out.println("\nTimer starting in: ");

		for (timer = 5; timer >= 0; timer--) {
			// A for loop which initiates a countdown before the timer starts
			// It displays the number 5 and decrements to 0 with a 1 sec delay in the middle

			System.out.println("\n" + timer + "...");

			Thread.sleep(1000);

		}

		startTime = System.currentTimeMillis();
		// A java.lan.System.currentTimeMillis method which returns the time of how long
		// the timer was on in milliseconds
		// The timer has commenced
		// It is later converted into seconds for simplicity

		System.out.println("\nSTART!!");

		Thread.sleep(1000);

		do {

			System.out.print("\n" + userName + " guess the number: ");

			numberGuess = scan.nextInt();

			if (numberGuess < number) {

				System.out.println("Your guess is too low. Try again.");

				attemptsLevelThree++;

				points -= 4;

			}

			else if (numberGuess > number) {

				System.out.println("Your guess is too high. Try again.");

				attemptsLevelThree++;

				points -= 8;

			}

		} while ((numberGuess != number) && (attemptsLevelThree < attemptsMax));
		{
			stopTime = System.currentTimeMillis();
			// The timer stops

			totalTime = stopTime - startTime;
			// This calculates the total duration the timer was on for

			millisecToSecConvert = (int) (totalTime / 1000);
			// Converting the time from milliseconds into seconds

			System.out.println("\nFINISH!!" + "\n\n\tSUMMARY:");

			System.out.println("It took you: " + millisecToSecConvert + " seconds to play LEVEL THREE.");
			// A println statement which writes the total duration the usser took to guess
			// the number

			if ((attemptsLevelThree == attemptsMax || numberGuess != number)) {

				System.out.println("You guessed a total of " + attemptsLevelThree + " times." + "\nYou have a total of "
						+ points + " points.");
				// A println statement which writes the total number of attempts and points
				// earned so far by the user to the console
				if (totalTime <= 20000) {

					points += 10;

					System.out.println("You get an additional 10 points for completing the level under 20 seconds."
							+ "\nNow you have " + points + " points.");
					// The user is awarded an additional 10 points if they use up all 10 guesses

				} else if (totalTime > 20000) {

					points -= 5;

					System.out.println(
							"You lose an additional 5 points for completing the level over 20 seconds. Now you have "
									+ points + " points.");
					// The user is deducted 5 points if they take longer than 20 seconds to complete
					// the level
					// Afterwhich the remaining points are written to the console

				}

				System.out.println("You have lost LEVEL THREE.");

				System.out.print("\nAlthough, you can select a number between 1-12 and get a free fortune cookie!: ");
				// If the user is unable to successfully guess the correct number within their
				// 10 guess limit they lose the game overall
				// They then get a fortune cookie

				fortuneCookie = scan.nextInt();

				if (fortuneCookie == 1) {
					// Nested if statements that display a specific fortune when the conditions are
					// met, in this case when the integer fortuneCookie is a number between 1-12

					System.out.println(funnyfortunes[0]);
				}

				else if (fortuneCookie == 2) {

					System.out.println(funnyfortunes[7]);

				}

				else if (fortuneCookie == 3) {

					System.out.println(funnyfortunes[2]);

				}

				else if (fortuneCookie == 4) {

					System.out.println(funnyfortunes[11]);

				}

				else if (fortuneCookie == 5) {

					System.out.print(funnyfortunes[9]);

				}

				else if (fortuneCookie == 6) {

					System.out.println(funnyfortunes[5]);

				}

				else if (fortuneCookie == 7) {

					System.out.println(funnyfortunes[3]);

				}

				else if (fortuneCookie == 8) {

					System.out.println(funnyfortunes[1]);

				}

				else if (fortuneCookie == 9) {

					System.out.println(funnyfortunes[6]);

				}

				else if (fortuneCookie == 10) {

					System.out.println(funnyfortunes[4]);

				}

				else if (fortuneCookie == 11) {

					System.out.println(funnyfortunes[8]);

				}

				else if (fortuneCookie == 12) {

					System.out.println(funnyfortunes[10]);

				}

			}

			else if (attemptsLevelThree < attemptsMax && attemptsLevelThree >= 1 || numberGuess == number) {

				attemptsLevelThree++;

				points += 300;

				System.out.println("You guessed " + attemptsLevelThree + " time/times." + "\nYou have a total of "
						+ points + " points.");
				// A println statement which shows the users attempts

				if (totalTime <= 20000) {

					points += 10;

					System.out.println("You get an additional 10 points for completing the level under 20 seconds."
							+ "\nNow you have " + points + " points.");
					// The user gains 10 points if they are able to complete the level under 20
					// seconds
					// The total is then written to the console

				} else if (totalTime > 20000) {

					points -= 5;

					System.out.println(
							"You lose an additional 5 points for completing the level over 20 seconds. Now you have "
									+ points + " points.");
					// The user is deducted 5 points if they take longer than 20 seconds to complete
					// the level
					// The total is then written to the console
				}

				System.out.println("Congrats you have passed LEVEL THREE!");
				// Level three ends
			}

		}

		System.out.println(
				"\n______________________________________________________________________________________________________________");

		System.out.println(
				"\n4️⃣LEVEL FOUR:\n\n" + userName + " please think of a number and input the range of this number: ");
		// Level four begins

		System.out.print(userName + " please enter the minimum number of the range: ");
		// The user is asked to input the minimum number of the range

		minNumber = scan.nextInt();

		System.out.print("Enter the maximum number of the range: ");
		// The user is asked to input the maximum number of the range

		maxNumber = scan.nextInt();

		System.out.print("Please also enter the number you want the computer to guess: ");
		// They are further asked to input the number they want the computer to guess

		numberGuess = scan.nextInt();

		System.out.println("\nComputer timer starting in: ");

		for (timer = 5; timer >= 0; timer--) {
			// A for loop which counts down from 5 to 0 before the timer begins

			System.out.println("\n" + timer + "...");

			Thread.sleep(1000);

		}

		startTime = System.currentTimeMillis();
		// The timer starts

		System.out.println("\nSTARTS!!");

		Thread.sleep(1000);

		do {

			computerOneGuess = (int) (Math.random() * ((maxNumber - minNumber) + 1)) + minNumber;
			// computerOneGuess rolls the number from the minimum and maximum numbers
			// provided from the user

			System.out.print("\nThe computer guessed the number " + computerOneGuess + ".");
			// The computer writes the rolled number to the console

			System.out.print("\nPlease state if it is \"high\", \"low\" or \"correct\": ");
			// The user indicates if it is "low", "high" or "correct"

			userNumber = scan.next();

			attemptsLevelFour++;

			if (userNumber.contentEquals("low")) {
				// The is executed when the user indicates computerOneGuess is low

				computerOneGuess = (int) (Math.random() * ((maxNumber - minNumber) + 1)) + minNumber;

				System.out.print("\nThe computer guessed the number " + computerOneGuess + ".");
				// The computer rolls another number and writes it to the console
				// The user is then asked if it is "low", "high" or "correct" once again

				System.out.print("\nPlease state if it is \"high\", \"low\" or \"correct\": ");

				userNumber = scan.next();

				attemptsLevelFour++;

				computerPoints -= 8;
				// 8 points are deducted each time computerOneGuess is higher than the
				// userNumber

			}

			if (userNumber.contentEquals("high")) {
				// The is executed when the user indicates computerOneGuess is high

				computerOneGuess = (int) (Math.random() * ((maxNumber - minNumber) + 1)) + minNumber;

				System.out.print("\nThe computer guessed the number " + computerOneGuess + ".");
				// The computer rolls another number and writes it to the console
				// The user is then asked if it is "low", "high" or "correct" once again

				System.out.print("\nPlease state if it is \"high\", \"low\" or \"correct\": ");

				userNumber = scan.next();

				attemptsLevelFour++;

				computerPoints -= 16;
				// 16 points are deducted each time computerOneGuess is higher than the
				// userNumber

			}

		} while ((numberGuess != computerOneGuess) && (userNumber.contentEquals("low"))
				|| (userNumber.contentEquals("high")));
		// A do-while loop which is executed when the numberGuess is not equal to
		// computerOneGuess, and userNumber equals ("low") or userNumber equals ("high")

		{
			computerPoints += 100;
			// The computer earns 100 points if it guesses the correct number

			stopTime = System.currentTimeMillis();
			// The timer stops

			totalTime = stopTime - startTime;
			// The total time is calculated

			millisecToSecConvert = (int) (totalTime / 1000);
			// Milliseconds are converted into seconds

			System.out.println("\nFINISH!!" + "\n\n\tSUMMARY:");

			System.out.println("It took the computer: " + millisecToSecConvert + " seconds to play LEVEL FOUR.");
			// The total amount of time it took the computer to guess the right number and
			// the user to indicate the correctness is displayed to the console

			if (numberGuess == computerOneGuess && (attemptsLevelFour >= 1) || (userNumber.contentEquals("correct"))) {

				System.out.println("The computer guessed " + attemptsLevelFour + " time/times."
						+ "\nThe computer earned " + computerPoints + " points.");
				// The total number of computer attempts are displayed to the user

				if (totalTime <= 20000) {

					computerPoints += 40;
					// The computer earns 40 points if it took under 20 seconds to guess the correct
					// number

					System.out.println(
							"The computer gets an additional 40 points for completing the level under 20 seconds."
									+ "\nNow it has " + computerPoints + " points.");
					// The added points are written to the console

				} else if (totalTime > 20000) {

					computerPoints -= 3;

					System.out.println(
							"The computer loses an additional 3 points for completing the level over 20 seconds. Now it has "
									+ computerPoints + " points.");
					// The computer is deducted 3 points if it took over 20 seconds to guess the
					// correct answer
				}

				System.out.println("Congrats the computer has passed LEVEL FOUR!");
				// Level four ends

			}

		}

		System.out.println(
				"\n______________________________________________________________________________________________________________");
		// computer two guesses the number computer one rolls

		System.out.println("\n\n*️⃣BONUS LEVEL:");
		// The bonus level begins
		// The computer plays against itself in this level

		System.out.println("\nJust sit back and watch the computer play against itself!");

		computerOneGuess = (int) (Math.random() * ((10 - 1) + 1)) + 1;
		// computerOneGuess is the computer that rolls the number and computerTwoGuess
		// is the computer which guesses the number
		// For simplicity and efficiency the minimum number is 1 and the maximum number
		// that can be rolled is 10
		System.out.println("\nComputer timer starting in: ");

		for (timer = 5; timer >= 0; timer--) {
			// A for loop which counts down the from 5 to 0 before the timer begins

			System.out.println("\n" + timer + "...");

			Thread.sleep(1000);
			// There is a 1 second delay before the timer starts

		}

		startTime = System.currentTimeMillis();
		// The timer starts

		System.out.println("\nSTART!!");

		Thread.sleep(1000);
		// There is another 1 second timer before computerTwoGuess is able to guess
		// computerOneGuess's number

		do {

			computerTwoGuess = (int) (Math.random() * ((10 - 1) + 1)) + 1;
			// computerTwoGuess rolls random number between 1 and 10

			System.out.print("\nComputer 2 guessed the number " + computerTwoGuess + ".");
			// This number is printed to the console

			if (computerOneGuess > computerTwoGuess) {
				// If computerTwoGuess is lower than computerOneGuess the following code will
				// execute

				System.out.println(
						"\nComputer 2s guess is lower than the number rolled by Computer 1." + "\nIt rolls again.");

				Thread.sleep(1000);
				// One second delay

				attemptsLevelBonus++;

				computerPoints -= 16;
				// The computerTwoGuess loses 16 points if the number it rolled is lower than
				// computerOneGuess

			} else if (computerOneGuess < computerTwoGuess) {
				// If computerTwoGuess is higher than computerOneGuess the following code will
				// execute

				System.out.println(
						"\nComputer 2s guess is higher than the number rolled by Computer 1." + "\nIt rolls again.");

				Thread.sleep(1000);
				// One second delay

				attemptsLevelBonus++;

				computerPoints -= 32;
				// The computerTwoGuess loses 32 points if the number it rolled is higher than
				// computerOneGuess

			}

		} while (computerOneGuess != computerTwoGuess);

		{
			attemptsLevelBonus++;

			computerPoints += 100;
			// computerTwoGuess earns 100 points if it rolls the correct number

			stopTime = System.currentTimeMillis();
			// Timer stops

			totalTime = stopTime - startTime;
			// Total time is calculated

			millisecToSecConvert = (int) (totalTime / 1000);
			// The time is converted from millisecnds to seconds

			System.out.println("\n\nFINISH!!" + "\n\n\tSUMMARY:");

			System.out.print(
					"It took the computer: " + millisecToSecConvert + " second/seconds to play the BONUS LEVEL.");
			// The total time it took computerTwoGuess to roll the correct number is printed
			// to the console

			System.out.print("\nThe computer guessed " + attemptsLevelBonus + " time/times." + "\nThe computer earned "
					+ computerPoints + " points.");
			// The number of attempts made by computerTwoGuess as well as the points earned
			// are written to the console

			if (attemptsLevelBonus >= 1) {

				if (totalTime <= 20000) {

					computerPoints += 10;

					System.out.println(
							"\nThe computer gets an additional 10 points for completing the level under 20 seconds."
									+ "\nNow it has " + computerPoints + " points.");
					// computerTwoGuess earns 10 additional points if it guesses the right answer
					// before 20 seconds

				} else if (totalTime > 20000) {

					computerPoints -= 5;

					System.out.println(
							"\nThe computer loses an additional 5 points for completing the level over 20 seconds."
									+ "\nNow it has " + computerPoints + " points.");
					// computerTwoGuess is deducted 5 additional points if it guesses the right
					// answer after 20 seconds

				}

				System.out.println("Congrats the computer has passed the BONUS LEVEL!");
				// The bonus level ends

				if (computerPoints == 110) {

					System.out.print("\nSince the computer has earned 110 points, and you have completed the game."
							+ "\nyou get a free spin on our spin the wheel."
							+ "\nSimply pick a number from 1-10 and you will get a reward: ");
					// If computerTwoGuess's the correct answer on it's first attempt it will earn
					// 100 points
					// This would occure within the first 20 seconds on the level and so it would
					// earn another 10 points
					// If this happens the user has the chance to obtain more points

					spinTheWheel = scan.nextInt();

					switch (spinTheWheel) {
					// A switch case selection statement that calculates the spin the wheel points
					// based on the
					// inputted number by the user
					case 1:
						points *= 10;
						System.out.println(userName + " your points are multiplied by 10. " + "\nOverall you have "
								+ points + " points.");

						break;

					case 2:
						points += 20;
						System.out.println(userName + " you are rewarded with another 20 points. "
								+ "\nOverall you have " + points + " points.");
						break;

					case 3:
						points *= 30;
						System.out.println(userName + " your points are multiplied by 30. " + "\nOverall you have "
								+ points + " points.");
						break;

					case 4:
						points += 40;
						System.out.println(userName + " you are rewarded with another 40 points. "
								+ "\nOverall you have " + points + " points.");
						break;

					case 5:
						points *= 50;
						System.out.println(userName + " your points are multiplied by 50. " + "\nOverall you have "
								+ points + " points.");
						break;

					case 6:
						points += 60;
						System.out.println(userName + " you are rewarded with another 60 points. "
								+ "\nOverall you have " + points + " points.");
						break;

					case 7:
						points *= 70;
						System.out.println(userName + " your points are multiplied by 70. " + "\nOverall you have "
								+ points + " points.");
						break;

					case 8:
						points += 80;
						System.out.println(userName + " you are rewarded with another 80 points. "
								+ "\nOverall you have " + points + " points.");
						break;

					case 9:
						points *= 90;
						System.out.println(userName + " your points are multiplied by 90. " + "\nOverall you have "
								+ points + " points.");
						break;

					case 10:
						points += 100;
						System.out.println(userName + " you are rewarded with another 100 points. "
								+ "\nOverall you have " + points + " points.");
						break;

					default:
						System.out.println("Not a valid number. You lose your free spin.");
						break;
					}

				}

				System.out.print("\n" + userName + " please rate your experince playing with us (1-worst & 5-best): ");
				// The guessing game ends with a feedback forum
				// The user is asked to rate their experience playing the game

				gameRate = scan.nextInt();

				switch (gameRate) {

				case 1:
					System.out.println("We appreciate the feedback. Thank you for your honesty.");
					break;

				case 2:
					System.out.println("We understand. Thanks for the feedback.");
					break;

				case 3:
					System.out.println("Alright, thank you for participating. Have a great day.");
					break;

				case 4:
					System.out.println("That is so kind of you.");
					break;

				case 5:
					System.out.println("That is flattering and very generous of you. Thanks!");
					break;

				default:
					System.out.println("We respect your choice not to share your feedback.");
					break;

				}

			}

		}

	}

}
