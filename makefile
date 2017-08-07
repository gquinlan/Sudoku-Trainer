###
# Copyright (c) 2016, Grant W Quinlan. All rights reserved.
#
# Redistribution and use in source and binary forms, with or without
# modification, are permitted provided that the following conditions
# are met:
#
#   - Redistributions of source code must retain the above copyright
#     notice and this list of conditions.
#
#
#   - Redistributions in binary form must reproduce the above copyright
#     notice and this list of conditions.
###

###
# SudukoTrainer Makefile
###
all:
	touch dummy.class 
	clear
	rm *.class $2> /dev/null
	javac SudukoTrainer.java
	java SudukoTrainer
	javac SudukoPuzzle.java
	java SudukoPuzzle

