export default class Page extends React.Component {
    constructor(props) {
        super(props);
    }

    componentDidMount() {
        super.componentDidMount();
        $(window).scrollTop(0);
    }
}
