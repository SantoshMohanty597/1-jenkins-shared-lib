def call(String env) {
    echo "Deploying to ${env}"

    if (env == 'prod') {
        echo "Production deployment"
    } else {
        echo "Non-prod deployment"
    }
}


def call(Map config = [:]) {
    def env = config.env ?: 'dev'
    def version = config.version ?: 'latest'

    echo "Deploying ${version} to ${env}"
}
