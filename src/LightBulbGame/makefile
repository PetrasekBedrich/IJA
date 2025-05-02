MAVEN := mvn
PROJECT_NAME := LightBulbGame

.PHONY: all compile run clean

all: compile run

compile:
	$(MAVEN) compile

run: compile
	$(MAVEN) javafx:run

clean:
	@echo "Cleaning $(PROJECT_NAME)..."
	$(MAVEN) clean