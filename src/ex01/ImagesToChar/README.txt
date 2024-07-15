javac -d target src/java/edu/school21/printer/app/Main.java src/java/edu/school21/printer/logic/*.java
cp -r src/resources target/
cd target
jar cvfm images-to-chars-printer.jar ../src/manifest.txt $(find . -name "*.class")
java -jar images-to-chars-printer.jar