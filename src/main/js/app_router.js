import Backbone  from 'backbone';
import React     from 'react';
import ReactDOM  from 'react-dom';
import CreateQuizPage from "./page/create_quize_page";

export default class AppRouter extends Backbone.Router {
    routes() {
        return {
            'create-quiz': 'createQuiz',
        }
    }

    createQuiz(){
        return this.renderContent(CreateQuizPage,{});
    }

    renderContent(name, options, contentId = 'pageContainer')
    {
        let Factory = React.createFactory(name);
        let component = Factory(options);
        let container = document.getElementById(contentId);
        this.render(component, container);
    }

    render(component, container) {
        ReactDOM.unmountComponentAtNode(container);
        ReactDOM.render(component, container);
    }
}
