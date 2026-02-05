package org.company.utils

class DockerUtils implements Serializable {

    def steps

    DockerUtils(steps) {
        this.steps = steps
    }

    def buildImage(String image) {
        steps.sh "docker build -t ${image} ."
    }

    def pushImage(String image) {
        steps.sh "docker push ${image}"
    }
}
