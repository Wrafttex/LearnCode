exec = LC.out
sources = $(wildcard src/*.c) 
#Object files are files the compiler creates, and links with the executionable
objects = $(sources:.c=.o)
flags = -g

$(exec): $(objects)
	gcc $(objects) $(flasgs) -o $(exec)

%.o: %.c include/%.h
	gcc -c $(flags) $< -o $@

clean:
	-rm *.out
	#remove object files
	-rm *.o
	#remove object files from source folder
	-rm src/*.o
