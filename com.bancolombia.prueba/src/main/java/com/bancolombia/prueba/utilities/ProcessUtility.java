package com.bancolombia.prueba.utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessUtility {
	
	private static final String listaDeTareas ="tasklist";
	private static final String asesinoDeTareas ="taskkill /IM ";
	
	public static boolean isProccessRunning(String serviceName) {
		try {
			Process pro = Runtime.getRuntime().exec(listaDeTareas);
			BufferedReader reader = new BufferedReader(new InputStreamReader(pro.getInputStream()));
			String line;
			while ((line = reader.readLine()) !=null) {
				if (line.startsWith(serviceName)) {
					return true;
				}
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static void killProcess(String serviceName) {
		try {
			Runtime.getRuntime().exec(asesinoDeTareas + serviceName);
			System.out.println(serviceName + " finalizado exitoso!");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}	