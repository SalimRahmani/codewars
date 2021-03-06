# Product of consecutive Fib numbers
<div class="panel is-darkened">
    <div class="markdown" id="description">
        <p>The Fibonacci numbers are the numbers in the following integer sequence (Fn):</p>
        <blockquote>
            <p>0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...</p>
        </blockquote>
        <p>such as </p>
        <blockquote>
            <p>F(n) = F(n-1) + F(n-2) with F(0) = 0 and F(1) = 1.</p>
        </blockquote>
        <p>Given a number, say prod (for product), we search two Fibonacci numbers F(n) and F(n+1) verifying </p>
        <blockquote>
            <p>F(n) * F(n+1) = prod.</p>
        </blockquote>
        <p>Your function productFib takes an integer (prod) and returns
            an array: </p>
        <pre><code>[F(n), F(n+1), true] or {F(n), F(n+1), 1} or (F(n), F(n+1), True)
</code></pre>
        <p>depending on the language if F(n) * F(n+1) = prod.</p>
        <p>If you don't find two consecutive F(m) verifying <code>F(m) * F(m+1) = prod</code>you will return</p>
        <pre><code>[F(m), F(m+1), false] or {F(n), F(n+1), 0} or (F(n), F(n+1), False)
</code></pre>
        <p>F(m) being the smallest one such as <code>F(m) * F(m+1) &gt; prod</code>.</p>
        <h1 id="examples">Examples</h1>
        <pre style="display: none;"><code class="lang-rust">productFib(<span class="hljs-number">714</span>) # should <span class="hljs-keyword">return</span> (<span class="hljs-number">21</span>, <span class="hljs-number">34</span>, <span class="hljs-literal">true</span>),
                # since F(<span class="hljs-number">8</span>) = <span class="hljs-number">21</span>, F(<span class="hljs-number">9</span>) = <span class="hljs-number">34</span> and <span class="hljs-number">714</span> = <span class="hljs-number">21</span> * <span class="hljs-number">34</span>

productFib(<span class="hljs-number">800</span>) # should <span class="hljs-keyword">return</span> (<span class="hljs-number">34</span>, <span class="hljs-number">55</span>, <span class="hljs-literal">false</span>),
                # since F(<span class="hljs-number">8</span>) = <span class="hljs-number">21</span>, F(<span class="hljs-number">9</span>) = <span class="hljs-number">34</span>, F(<span class="hljs-number">10</span>) = <span class="hljs-number">55</span> and <span class="hljs-number">21</span> * <span class="hljs-number">34</span> &lt; <span class="hljs-number">800</span> &lt; <span class="hljs-number">34</span> * <span class="hljs-number">55</span>
</code></pre>
        <pre style="display: none;"><code class="lang-ruby">productFib(<span class="hljs-number">714</span>) <span class="hljs-comment"># should return [21, 34, true], </span>
                <span class="hljs-comment"># since F(8) = 21, F(9) = 34 and 714 = 21 * 34</span>

productFib(<span class="hljs-number">800</span>) <span class="hljs-comment"># should return [34, 55, false], </span>
                <span class="hljs-comment"># since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 &lt; 800 &lt; 34 * 55</span>
</code></pre>
        <pre style="display: none;"><code class="lang-crystal">productFib(<span class="hljs-number">714</span>) <span class="hljs-comment"># should return [21, 34, true], </span>
                <span class="hljs-comment"># since F(8) = 21, F(9) = 34 and 714 = 21 * 34</span>

productFib(<span class="hljs-number">800</span>) <span class="hljs-comment"># should return [34, 55, false], </span>
                <span class="hljs-comment"># since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 &lt; 800 &lt; 34 * 55</span>
</code></pre>
        <pre style="display: none;"><code class="lang-python">productFib(<span class="hljs-number">714</span>) <span class="hljs-comment"># should return [21, 34, true], </span>
                <span class="hljs-comment"># since F(8) = 21, F(9) = 34 and 714 = 21 * 34</span>

productFib(<span class="hljs-number">800</span>) <span class="hljs-comment"># should return [34, 55, false], </span>
                <span class="hljs-comment"># since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 &lt; 800 &lt; 34 * 55</span>
</code></pre>
        <pre style="display: none;"><code class="lang-clojure">productFib(714) # should return [21, 34, true],
                # since F(8) = 21, F(9) = 34 and 714 = 21 * 34

productFib(800) # should return [34, 55, false],
                # since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 &lt; 800 &lt; 34 * 55
</code></pre>
        <pre style="display: none;"><code class="lang-javascript">productFib(714) # should return [21, 34, true],
                # since F(8) = 21, F(9) = 34 and 714 = 21 * 34

productFib(800) # should return [34, 55, false],
                # since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 &lt; 800 &lt; 34 * 55
</code></pre>
        <pre style="display: none;"><code class="lang-php">productFib(<span class="hljs-number">714</span>) <span class="hljs-comment"># should return [21, 34, true], </span>
                <span class="hljs-comment"># since F(8) = 21, F(9) = 34 and 714 = 21 * 34</span>

productFib(<span class="hljs-number">800</span>) <span class="hljs-comment"># should return [34, 55, false], </span>
                <span class="hljs-comment"># since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 &lt; 800 &lt; 34 * 55</span>
</code></pre>
        <pre style="display: none;"><code class="lang-coffeescript">productFib(<span class="hljs-number">714</span>) <span class="hljs-comment"># should return [21, 34, true], </span>
                <span class="hljs-comment"># since F(8) = 21, F(9) = 34 and 714 = 21 * 34</span>

productFib(<span class="hljs-number">800</span>) <span class="hljs-comment"># should return [34, 55, false], </span>
                <span class="hljs-comment"># since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 &lt; 800 &lt; 34 * 55</span>
</code></pre>
        <pre style="display: none;"><code class="lang-csharp">productFib(<span class="hljs-number">714</span>) <span class="hljs-meta"># should return {21, 34, 1}, </span>
                <span class="hljs-meta"># since F(8) = 21, F(9) = 34 and 714 = 21 * 34</span>

productFib(<span class="hljs-number">800</span>) <span class="hljs-meta"># should return {34, 55, 0}, </span>
                <span class="hljs-meta"># since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 &lt; 800 &lt; 34 * 55</span>
</code></pre>
        <pre><code class="lang-java">productFib(714) # should return {21, 34, 1},
                # since F(8) = 21, F(9) = 34 and 714 = 21 * 34

productFib(800) # should return {34, 55, 0},
                # since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 &lt; 800 &lt; 34 * 55
</code></pre>
        <pre style="display: none;"><code class="lang-cpp">productFib(<span class="hljs-number">714</span>) <span class="hljs-meta"># should return {21, 34, true}, </span>
                <span class="hljs-meta"># since F(8) = 21, F(9) = 34 and 714 = 21 * 34</span>

productFib(<span class="hljs-number">800</span>) <span class="hljs-meta"># should return {34, 55, false}, </span>
                <span class="hljs-meta"># since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 &lt; 800 &lt; 34 * 55</span>
</code></pre>
        <pre style="display: none;"><code class="lang-c">productFib(<span class="hljs-number">714</span>) <span class="hljs-meta"># should return {21, 34, true}, </span>
                <span class="hljs-meta"># since F(8) = 21, F(9) = 34 and 714 = 21 * 34</span>

productFib(<span class="hljs-number">800</span>) <span class="hljs-meta"># should return {34, 55, false}, </span>
                <span class="hljs-meta"># since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 &lt; 800 &lt; 34 * 55</span>
</code></pre>
        <pre style="display: none;"><code class="lang-haskell"><span class="hljs-title">productFib</span> <span class="hljs-number">714</span> <span class="hljs-comment">-- should return (21, 34, True)</span>
               <span class="hljs-comment">-- since F(8) = 21, F(9) = 34 and 714 = 21 * 34</span>
<span class="hljs-title">productFib</span> <span class="hljs-number">800</span> <span class="hljs-comment">-- should return (34, 55, False), </span>
               <span class="hljs-comment">-- since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 &lt; 800 &lt; 34 * 55</span>
</code></pre>
        <p><strong>Notes:</strong> Not useful here but we can tell how to choose the number n up to which to go: we can
            use the "golden ratio" phi which is <code>(1 + sqrt(5))/2</code> knowing that F(n) is asymptotic to: <code>phi^n / sqrt(5)</code>.
            That gives a possible upper bound to n.</p>
        <p>You can see examples in "Example test".</p>
        <h3 id="references">References</h3>
        <p><a href="http://en.wikipedia.org/wiki/Fibonacci_number" target="_blank">http://en.wikipedia.org/wiki/Fibonacci_number</a></p>
        <p><a href="http://oeis.org/A000045" target="_blank">http://oeis.org/A000045</a></p>
    </div>
    <div class="mtm"><span><i class="icon-moon-tag "></i></span>
        <div class="keyword-tag">Fundamentals</div>
    </div>
</div>