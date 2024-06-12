package com.javatpoint.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController 
{
@RequestMapping("/")
public String hello() 
{
return "Hello javaTpoint";
}
}
package com.manju.jobportal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NotepadAutomation {
	public static void main(String[] args) throws AWTException {

		while (true) {
			eclipse();
		}

	}

	private static List<String> readFolder(String folderPath) {
		List<String> fileContents = new ArrayList<>();

		File folder = new File(folderPath);

		// Check if the specified path is a directory
		if (folder.isDirectory()) {
			File[] files = folder.listFiles();

			// Iterate through all files and subdirectories in the folder
			for (File file : files) {
				if (file.isFile()) {
					try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
						StringBuilder content = new StringBuilder();
						String line;
						while ((line = reader.readLine()) != null) {
							line = line.trim();
							content.append(line).append("\n");
						}
						fileContents.add(content.toString());
					} catch (IOException e) {
						e.printStackTrace();
					}
				} else if (file.isDirectory()) {
					// Recursively call the function for subdirectories
					fileContents.addAll(readFolder(file.getAbsolutePath()));
				}
			}
		} else {
			System.err.println("The specified path is not a directory.");
		}
		return fileContents;
	}

	private static void notepad() {
		try {
			// Create an instance of Robot
			Robot robot = new Robot();

			// Delay before starting Notepad (adjust as needed)
			robot.delay(2000);

			// Open Notepad by pressing Win + R and typing "notepad" followed by Enter
			robot.keyPress(KeyEvent.VK_WINDOWS);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_WINDOWS);
			robot.delay(1000); // Delay for the Run dialog to appear
			typeText(robot, "notepad", 200);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			// Wait for Notepad to open (adjust as needed)
			robot.delay(2000);
			typeText(robot, "Please find the observations on fixes as below :\r\n" + "\r\n"
					+ "Add Corp ID validation for V5 API – Corp ID validation is not working, only CIF validation is working.\r\n"
					+ "Fund Transfer - Configure the OTP parameter. - Fixed\r\n"
					+ "      3.   FT Approval API is not working. – 500 internal server Error. PFA req and resp with logs.\r\n"
					+ "\r\n" + "       4.   FT amount and ft type database – Fixed\r\n" + "\r\n"
					+ "       5.   Validate account against logged in user – Need to add validation for all corporate API\r\n"
					+ "\r\n" + "       6.   DMS upload feature added in Corp – Fixed\r\n" + "\r\n"
					+ "       7.   Corporate onboarding - token removal – Fixed\r\n" + "\r\n"
					+ "       8.   Account Related API are not working under corporate Service. – getting exception error\r\n"
					+ "\r\n" + "     \r\n" + "\r\n" + " \r\n" + "\r\n" + "Pending Points:\r\n" + "\r\n"
					+ "1. Beneficiary API - After approval transaction getting failed. (V5 issue need to check with Yashwant Team)\r\n"
					+ "\r\n"
					+ "2. Login validation for IB, MB user - Allow IB,MB (Will be delivered after corporate version released)\r\n"
					+ "\r\n" + "3. Individuals API' -RTGS,NEFT (TODO Will test and let you know by Manju)\r\n" + "\r\n"
					+ " ", 400);

			robot.delay(2000);

//		// Send Alt + H to open the Help menu
//		robot.keyPress(KeyEvent.VK_ALT);
//		robot.keyPress(KeyEvent.VK_H);
//		robot.keyRelease(KeyEvent.VK_H);
//		robot.keyRelease(KeyEvent.VK_ALT);
//
//		// Send "V" to select "View Help" from the menu
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.delay(2000);
//
//		// Send Alt + F4 to close chrome
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_W);
//		robot.keyRelease(KeyEvent.VK_W);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.delay(2000);

			// Send Ctrl + S to initiate the Save dialog
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_CONTROL);

			// Delay to allow the Save dialog to appear (adjust as needed)
			robot.delay(2000);

			String name = new java.util.Date().getTime() + "";
			typeText(robot, name + "file.txt", 200);
			robot.delay(1000);
//         Press Enter to save the file
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(2000);

//        // Send Alt + F4 to close Notepad
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_F4);
			robot.keyRelease(KeyEvent.VK_F4);
			robot.keyRelease(KeyEvent.VK_ALT);
			robot.delay(2000);

		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	private static void eclipse() {
		try {
			// Create an instance of Robot
			Robot robot = new Robot();

			// Delay before starting Notepad (adjust as needed)
			robot.delay(2000);

			// Open Notepad by pressing Win + R and typing "notepad" followed by Enter
			robot.keyPress(KeyEvent.VK_WINDOWS);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_WINDOWS);
			robot.delay(1000); // Delay for the Run dialog to appear
//			typeText(robot, "C:\\Users\\mf11301\\Desktop\\Eclipse IDE for Java Developers - 2023-09.lnk", 100);
			typeText(robot, "notepad++", 100);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			// Wait for Notepad to open (adjust as needed)
			robot.delay(2000);
			for (String content : readFolder(
					"D:\\Source\\SBM\\Source\\SBM\\portal-ui\\src\\app\\components")) {
// 				for (String content : readFolder(
// 						"D:\\Source\\SBM\\Source\\Modefin-Microservices\\modefin-fundtransfer-service\\src")) {
//				
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_N);
				robot.keyRelease(KeyEvent.VK_N);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				typeText(robot, content, 300);
				robot.delay(1000);
			}

			robot.delay(2000);
			// Send Ctrl + S to initiate the Save dialog
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_CONTROL);

			// Delay to allow the Save dialog to appear (adjust as needed)
			robot.delay(2000);

			String name = new java.util.Date().getTime() + "";
			typeText(robot, name + "file.txt", 300);
			robot.delay(1000);
//         Press Enter to save the file
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(2000);

//        // Send Alt + F4 to close Notepad
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_F4);
			robot.keyRelease(KeyEvent.VK_F4);
			robot.keyRelease(KeyEvent.VK_ALT);
			robot.delay(2000);
			notepad();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	private static boolean handleAllCases(Robot robot, char s, int keyCode, int delay) {
		switch (s) {
		case ':':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_SEMICOLON);
			robot.keyRelease(KeyEvent.VK_SEMICOLON);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.delay(delay);
			return true;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.delay(delay);
			return true;
		case '!':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_1);
			robot.keyRelease(KeyEvent.VK_1);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.delay(delay);
			return true;
		case '@':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_2);
			robot.keyRelease(KeyEvent.VK_2);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.delay(delay);
			return true;
		case '#':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_3);
			robot.keyRelease(KeyEvent.VK_3);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			return true;
		case '$':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_4);
			robot.keyRelease(KeyEvent.VK_4);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			return true;
		case '%':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_5);
			robot.keyRelease(KeyEvent.VK_5);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			return true;
		case '^':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_6);
			robot.keyRelease(KeyEvent.VK_6);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			return true;
		case '&':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_7);
			robot.keyRelease(KeyEvent.VK_7);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			return true;
		case '*':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_8);
			robot.keyRelease(KeyEvent.VK_8);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			return true;
		case '(':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_9);
			robot.keyRelease(KeyEvent.VK_9);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			return true;
		case ')':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_0);
			robot.keyRelease(KeyEvent.VK_0);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			return true;
		case '_':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_SHIFT);

			return true;
		case '-':
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			return true;
		case '+':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_EQUALS);
			robot.keyRelease(KeyEvent.VK_EQUALS);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			return true;
		case '=':
			robot.keyPress(KeyEvent.VK_EQUALS);
			robot.keyRelease(KeyEvent.VK_EQUALS);
			return true;
		case '{':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
			robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			return true;
		case '}':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
			robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			return true;
		case '[':
			robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
			robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
			return true;
		case ']':
			robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
			robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
			return true;
		case '"':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_QUOTE);
			robot.keyRelease(KeyEvent.VK_QUOTE);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			return true;
		case '<':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_COMMA);
			robot.keyRelease(KeyEvent.VK_COMMA);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			return true;
		case '>':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_PERIOD);
			robot.keyRelease(KeyEvent.VK_PERIOD);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			return true;
		case '?':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_SLASH);
			robot.keyRelease(KeyEvent.VK_SLASH);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			return true;
		case '~':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_BACK_QUOTE);
			robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			return true;

		case '\'':
			robot.keyPress(KeyEvent.VK_QUOTE);
			robot.keyRelease(KeyEvent.VK_QUOTE);
			return true;
		case '/':
			robot.keyPress(KeyEvent.VK_SLASH);
			robot.keyRelease(KeyEvent.VK_SLASH);
			return true;

		case '`':
			robot.keyPress(KeyEvent.VK_BACK_QUOTE);
			robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
			return true;
		case '\\':
			robot.keyPress(KeyEvent.VK_BACK_SLASH);
			robot.keyRelease(KeyEvent.VK_BACK_SLASH);
			return true;
		case '|':
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_BACK_SLASH);
			robot.keyRelease(KeyEvent.VK_BACK_SLASH);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			return true;
		case ';':
			robot.keyPress(KeyEvent.VK_SEMICOLON);
			robot.keyRelease(KeyEvent.VK_SEMICOLON);
			return true;
		case ',':
			robot.keyPress(KeyEvent.VK_COMMA);
			robot.keyRelease(KeyEvent.VK_COMMA);
			return true;
		case '.':
			robot.keyPress(KeyEvent.VK_PERIOD);
			robot.keyRelease(KeyEvent.VK_PERIOD);
			return true;
		default:
			return false;
		}
	}

	// Helper method to type text character by character
	private static void typeText(Robot robot, String text, int delay) {
		for (char c : text.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

			try {
				if (KeyEvent.CHAR_UNDEFINED == keyCode) {
//				throw new RuntimeException("Key code not found for character: " + c);
				} else {
					boolean isTyped = handleAllCases(robot, c, keyCode, delay);
					if (!isTyped) {

						robot.keyPress(keyCode);
						robot.keyRelease(keyCode);
						robot.delay(delay);
					}
				}
			} catch (Exception e) {

			}
		}
	}
}
