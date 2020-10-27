
FileReader fr = new FileReader("variaveisexternas.txt");
BufferedReader br = new BufferedReader(fr);

line = br.readLine();

for (int i = 0; i < linha; i++) {
	line = br.readLine();
	MyIO.println(line);
}


br.close();
fr.close();
