import page from 'page'
import socket from './websocket'
import mithril from 'mithril'
import $ from 'jquery'

$(() => {
    // socket.send("Hello from client");

    const root = $('#app').get(0);

    page('/', (ctx, next) => {
        // @ts-ignore
        mithril.render(root, <div id="title">Hello world</div>)
    });
    page('/test', (ctx, next) => {
    });
    page.start();
});

function redirect(path: string) {
    page.show(path)
}