compile:
	javac -d target -cp src/lib/jcommander-1.72.jar:src/lib/JCDP-4.0.2.jar src/java/edu/school21/printer/app/Main.java src/java/edu/school21/printer/logic/*.java
	cp -r src/resources target/
	jar -xf src/lib/jcommander-1.72.jar
	jar -xf src/lib/JCDP-4.0.2.jar
	cp -r com target/
	rm -rf com
	rm -rf META-INF
	#cd target && jar cvfm images-to-chars-printer.jar ../src/manifest.txt $(find . -name "*.class")
	#java -jar images-to-chars-printer.jar --white=RED --black=GREEN
clear:
	rm -rf target META-INF