var babelify = require("babelify");
browserify().transform("babelify", {presets: ["es2015"]});