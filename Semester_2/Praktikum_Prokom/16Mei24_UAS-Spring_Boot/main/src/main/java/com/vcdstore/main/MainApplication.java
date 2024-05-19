package com.vcdstore.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Bisa langsung dijalankan dan melakukan Operasi CRUD
 * belum coba tanpa ada data dari tabel sql
 * known bug: warning message dari productDto tidak bisa dipakai di form edit item
 * Thanks to Zakki udah minjemin laptop buat ngoding
 */

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
		
	}
}
