/**
 * Created by Magp on 2016/7/15.
 */
var webpack=require('webpack')

var config={
    entry:'./src/index.js',
    output:{
        path:'./dist',
        filename:'bundle.js'
    },
    module:{
        loaders:[
            {test:/\.css$/,loader:"style!css"},//支持css模块化加载
            {test:/\.gif$/,loader:'url-loader'},
            {test:/\.png$/,loader:'url-loader'},
            {test:/\.hbs$/,loader:'handlebars-loader'}
        ]
    }
};

module.exports=config;