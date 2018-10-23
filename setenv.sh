#!/bin/bash
  if [ "${TRAVIS_BRANCH}" == "develop" ]; then
    ENV=dev
	echo "setting environment to dev"
  else
    ENV=prod
	echo "setting environment to prod"
  fi

  export ENV
