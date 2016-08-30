(ns hypster.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[hypster started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[hypster has shut down successfully]=-"))
   :middleware identity})
