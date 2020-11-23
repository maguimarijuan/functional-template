(ns exercise2)

(defn only-greater-than-five-recursive
  "Recursive wrapper to main function"
  [x i aux]
  (if (= i -1)
    aux
    (if(> (nth x i) 5)
        (only-greater-than-five-recursive x (dec i) (conj aux (nth x i)))
        (only-greater-than-five-recursive x (dec i) aux)))
)

(defn only-greater-than-five
  "Filters the input list returning only the elements greater than 5."
  [x]
  (only-greater-than-five-recursive x (dec (count x)) ())
)
