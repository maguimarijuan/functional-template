(ns exercise3)

(defn fibonacci
  "Calculates the fibonacci result fo the given input value."
  [x]
  (if(< x 2)
    x
    (+ (fibonacci (dec x)) (fibonacci (dec (dec x)))))
)