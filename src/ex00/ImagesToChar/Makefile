all: clear compile run
compile:
	javac -d target src/java/edu/school21/printer/app/Main.java src/java/edu/school21/printer/logic/*.java
run:
	cp it.bmp target
	cd target && java edu/school21/printer/app/Main
clear:
	rm -rf target