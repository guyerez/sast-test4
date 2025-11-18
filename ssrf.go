package main

import (
	"bytes"
	"net/http"
)

func main(wr http.ResponseWriter, req *http.Request) {
	if err != nil {
		logger.WithContext(r.Context()).WithError(err).Error("Unable to marshal request payload for session transfer")
		http.Error(w, httperrors.InternalServerError, http.StatusInternalServerError)
		return
	}
	// read payload from http request
	payload := req.Body

	req, err := http.NewRequest("POST", authenticator.Config.Endpoint.TokenURL, bytes.NewReader(payload))
	if err != nil {
		logger.WithContext(r.Context()).WithError(err).Error("Unable to create http-Request")
		http.Error(w, httperrors.InternalServerError, http.StatusInternalServerError)
		return
	}
}
