import org.company.utils.DockerUtils

def call(String image) {
    def docker = new DockerUtils(this)
    docker.buildImage(image)
    docker.pushImage(image)
}
