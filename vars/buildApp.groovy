def call() {
    echo "Building application..."
    sh '''
        echo "Compiling code"
        mvn clean package
    '''
}
