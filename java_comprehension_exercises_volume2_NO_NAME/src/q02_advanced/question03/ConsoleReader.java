package q02_advanced.question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 標準入力を制御するクラス
 */
class ConsoleReader {

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public String inputString() throws IOException {
		return reader.readLine();
	}

	public int inputNumber() throws IOException, NumberFormatException {
		//TODO ここから実装する
		return Integer.parseInt(reader.readLine());
	}

}