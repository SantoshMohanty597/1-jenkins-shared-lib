def call(String env) {
    echo "Deploying to ${env}"

    if (env == 'prod') {
        echo "Production deployment"
    } else {
        echo "Non-prod deployment"
    }
}
