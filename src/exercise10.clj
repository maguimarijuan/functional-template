(ns exercise10)

(defn open-account []
  (hash-map "balance" 0)
)

(defn close-account [account]
  nil
)

(defn get-balance [account]
  (get account "balance")
)

(defn update-balance [account amount]
  (hash-map "balance" (+ (get account "balance") amount))
)

