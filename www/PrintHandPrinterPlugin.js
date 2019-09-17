var exec = require('cordova/exec');

module.exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'PrintHandPrinterPlugin', 'coolMethod', [arg0]);
};

module.exports.print = function (arg0, success, error) {
    exec(success, error, 'PrintHandPrinterPlugin', 'print', [arg0]);
};