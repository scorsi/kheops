var path = require('path');

module.exports = {
    entry: './clientSources/index',
    output: {
        path: path.resolve(__dirname, 'serverResources/static'),
        filename: 'app.bundle.js'
    },
    resolve: {
        extensions: ['.ts', '.tsx', '.js', '.json']
    },
    module: {
        rules: [{
            test: /\.(tsx?)|(js)$/,
            exclude: /node_modules/,
            loader: 'babel-loader'
        }]
    }
};