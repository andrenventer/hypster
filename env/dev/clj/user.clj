(ns user
  (:require [mount.core :as mount]
            hypster.core))

(defn start []
  (mount/start-without #'hypster.core/repl-server))

(defn stop []
  (mount/stop-except #'hypster.core/repl-server))

(defn restart []
  (stop)
  (start))


