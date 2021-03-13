package com.file.handler.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.file.accounts.model.Account;
import com.file.accounts.model.Accounts;
import com.file.accounts.model.IAccount;

public class ReadFile {

	private static ReadFile instance;
	private File file = null;
	private Accounts accounts;

	public static ReadFile getInstance() {
		if (instance == null) {
			return new ReadFile();
		}
		return instance;
	}

	private ReadFile() {
		accounts = new Accounts(new ArrayList<>());
	}

	public void readFile(String filePath) {
		file = new File(filePath);
		parseThroughFile();
	}

	public File getFile() {
		return file;
	}

	public Accounts getAllAccounts() {
		return accounts;
	}

	private void parseThroughFile() {
		try (Scanner z = new Scanner(new FileReader(file))) {
			while (z.hasNextLine()) {
				String accountLine = z.nextLine().trim();
				if (ValidateCheckDigits.isValidAccount(accountLine)) {
					accounts.addValidAccount(new Account(accountLine));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
