package main

import (
	"bytes"
	"net/http"
)

func main(wr http.ResponseWriter, req *http.Request) {
	if err != nil {
		logger.WithContext(r.Context()).WithError(err).Error("error")
		http.Error(w, httperrors.InternalServerError, http.StatusInternalServerError)
		return
	}
	// read payload from http request
	payload := req.Body

	req, err := http.NewRequest("POST", url, bytes.NewReader(payload))
	if err != nil {
		logger.WithContext(r.Context()).WithError(err).Error("unable")
		http.Error(w, httperrors.InternalServerError, http.StatusInternalServerError)
		return
	}
}
