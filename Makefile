MAIN := src/main
MEDIATOR := src/mediator
COLLEAGUES := src/colleagues
FLOORSTATES := src/floorstates

CP := classes

all: build_jar clean

build_jar:floorstates colleagues mediator main
	cd $(CP); jar -cfv ../hw4.jar *;

floorstates: $(FLOORSTATES)
	javac -sourcepath src -d $(CP) $(FLOORSTATES)/*.java

colleagues: $(COLLEAGUES)
	javac -sourcepath src -d $(CP) $(COLLEAGUES)/*.java

mediator: $(MEDIATOR)
	javac -sourcepath src -d $(CP) $(MEDIATOR)/*.java

main: $(MAIN)
	javac -sourcepath src -d $(CP) $(MAIN)/*.java
 
clean:
	rm -r $(CP)/*