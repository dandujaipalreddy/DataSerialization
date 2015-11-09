export CLASSPATH

# Make sure this doesn't fail if ant is not configured.
clean-local:
	ANT=$(ANT) ; if test -z "$$ANT" ; then ANT=: ; fi ; \
	$$ANT $(ANT_FLAGS) clean

all-local:
	$(ANT) $(ANT_FLAGS) compile

check-local: all
	$(ANT) $(ANT_FLAGS) test

tutorial: all
	$(ANT) $(ANT_FLAGS) tutorial

tutorialserver: all
	$(ANT) $(ANT_FLAGS) tutorialserver

tutorialclient: all
	$(ANT) $(ANT_FLAGS) tutorialclient

EXTRA_DIST = \
	build.xml \
	src \
	
