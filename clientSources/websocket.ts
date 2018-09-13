const ws = new WebSocket('ws://localhost:8080');

ws.onopen = () => {
    alert("Opened!");
    ws.send("Hello Server");
};

ws.onmessage = (evt) => {
    alert("Message: " + evt.data);
};

ws.onclose = () => {
    alert("Closed!");
};

ws.onerror = (err) => {
    alert("Error: " + err);
};

export default ws