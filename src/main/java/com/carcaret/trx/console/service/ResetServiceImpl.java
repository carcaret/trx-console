package com.carcaret.trx.console.service;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import com.carcaret.trx.console.util.Date;

public class ResetServiceImpl implements ResetService {

	@Override
	public void reset() {
		try {
			String date = Date.getDate();
			File target = new File(String.format("files/estadisticas_%s.xml"), date);
			if (target.exists()) {
				throw new IllegalArgumentException(String.format(
						"Can't reset, statistics for date '%s' already exists",
						date));
			}
			Files.copy(
					new File("files/estadisticas.xml").toPath(),
					target.toPath(),
					StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
