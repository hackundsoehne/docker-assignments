# docker assignments for the tooling deep-dive
the [tooling deep dive](https://www.facebook.com/events/1705620649739179/) is a bootcamp organized by [Hack & Söhne](https://hackundsoehne.de). 

## 1. Installing docker
First we need to install [docker community edition](https://www.docker.com/community-edition). You can get docker CE for your OS here: https://store.docker.com/search?type=edition&offering=community

## 2. A first step using docker
First run `docker pull hello-world`, this will download the latest hello-world image.
To actually run the image type `docker run hello-world`, this should verify that everything is set up correctly.
(you may want to delete the container AND the image! HINT).

## 3. Your first assignment
Pull the ubuntu (ubuntu:latest) image and run `docker run --name ubuntu-test -i -t ubuntu bash`. You are now running bash inside the ubuntu image, explore the image (if you are feeling adventurous you can delete important files!).
`docker run` starts the image, `--name ubuntu-test` names the container ubuntu-test and `-i -t` allocates an interactive pseudo TTY.
to exit, type `exit`.
