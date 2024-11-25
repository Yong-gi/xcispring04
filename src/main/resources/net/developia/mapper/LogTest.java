package net.developia.mapper;

import lombok.extern.java.Log;
// debug ,warning, info, error
@Log
public class LogTest {
	public static void main(String[] args) {
		System.out.println("hello~");
		log.warning("warning..");
		log.info("info...");
	}
}
