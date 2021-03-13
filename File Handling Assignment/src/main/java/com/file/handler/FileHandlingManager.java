package com.file.handler;

import com.file.accounts.model.Accounts;
import com.file.handler.reader.ReadFile;
import com.file.handler.writer.WriteFile;

public class FileHandlingManager {

	private static final String ACCOUNTS_TXT_PATH = "src/main/resources/accounts/accounts.txt";
	private static ReadFile reader;
	private static WriteFile writer;
	private static Accounts accounts;

	public static void run() {
		
	}
	
	private static void readAccountsProgram() {
		reader = ReadFile.getInstance();
		reader.readFile(ACCOUNTS_TXT_PATH);
		accounts = reader.getAllAccounts();
		writer = WriteFile.getInstance();
		writer.writeValidAccountsToNewFile();
	}

	public static String getWriteFileName() {
		return "ValidAccounts" + System.currentTimeMillis() + ".txt";
	}

	public static Accounts getValidAccounts() {
		return accounts;
	}

}
