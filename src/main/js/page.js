import React from 'react';
// const React = require('react');

export default class Page extends React.Component {
    constructor(props) {
        super(props);
    }

    componentDidMount() {
        // super.componentDidMount();
        $(window).scrollTop(0);
    }
}
