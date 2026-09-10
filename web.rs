use tokio_tungstenite::connect_async;
use url::Url;

async fn connect(host: &str) {
    // ruleid: rust-insecure-websocket-connection
    let _ = connect_async("ws://example.com/ws").await;

    // ruleid: rust-insecure-websocket-connection
    let uri = Url::parse("ws://api.example.com/feed").unwrap();

    // ruleid: rust-insecure-websocket-connection
    let built = format!("ws://{}", host);
}
