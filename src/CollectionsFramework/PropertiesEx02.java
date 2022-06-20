package CollectionsFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx02 {
	public static void main(String[] args) {
		// commandLine���� inputfile�� ���������� ������ ���α׷� ����
		if(args.length != 1) {
			System.out.println("USAGE: java PropertiesEx02 INPUTFILENAME");
			System.exit(0);
		}
		
		Properties prop = new Properties();
		
		String inputFile = args[0];
		
		try {
			prop.load(new FileInputStream(inputFile));
		} catch (IOException e) {
			System.out.println("����: " + e.getMessage());
			System.exit(0);
		}
		
		String name = prop.getProperty("name");
		String[] data = prop.getProperty("data").split(",");
		int max = 0, min = 0;
		int sum = 0;
		
		for(int i = 0; i < data.length; i++) {
			int intValue = Integer.parseInt(data[i]);
			
			if(i == 0) max = min = intValue;
			
			if(max < intValue)
				max = intValue;
			else if(min > intValue)
				min = intValue;
			
			sum += intValue;
		}
		
		System.out.println("�̸�: " + name);
		System.out.println("�ִ밪: " + max);
		System.out.println("�ּҰ�: " + min);
		System.out.println("�հ�: " + sum);
		System.out.println("���: " + (sum * 100.0 / data.length) / 100);
	}
}