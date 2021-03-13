package com.file.handler.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.file.accounts.model.Accounts;
import com.file.accounts.model.IAccount;
import com.file.handler.FileHandlingManager;

public class WriteFile {

	private Accounts accounts;
	private static WriteFile instance;
	private File newFile;
	private static final String WRITE_PATH = "src/main/resources/accounts/";
	
	public static WriteFile getInstance() {
		if(instance == null) {
			return new WriteFile(FileHandlingManager.getWriteFileName());
		}
		return instance;
	}
	
	private WriteFile(String fileName) {
		newFile = new File(WRITE_PATH+fileName);
		accounts = FileHandlingManager.getValidAccounts();
	}

	public void writeValidAccountsToNewFile() {
		try (FileWriter writer = new FileWriter(newFile)){
			for(IAccount account : accounts.getAccounts()) {
				writer.write(account.getAccountNumber()+"\n");
			}
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public void writeToFileWithUnderscore(String content) {
		try(FileWriter writer = new FileWriter(newFile)) {
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public File getNewFile() {
		return newFile;
	}
}
