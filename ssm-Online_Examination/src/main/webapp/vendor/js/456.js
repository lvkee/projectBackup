!Respond.js
v1
.4
.2
minmax - width
media
query
polyfill
Copyright
2013
Scott
Jehl
Licensed
under
httpsgithub.comscottjehlRespondblobmasterLICENSE - MIT


!function (a) {
    use
    strict;
    a.matchMedia = a.matchMediafunction(a)
    {
        var b, c = a.documentElement, d = c.firstElementChildc.firstChild, e = a.createElement(body),
            f = a.createElement(div);
        return f.id = mq - test - 1, f.style.cssText = positionabsolute;
        top - 100
        em, e.style.background = none, e.appendChild(f), function (a) {
            return f.innerHTML = '&shy;style media=' + a + ' #mq-test-1 { width 42px; }style', c.insertBefore(e, d), b = 42 === f.offsetWidth, c.removeChild(e), {
                matchesb,
                mediaa
            }
        }
    }
    (a.document)
}(this), function (a) {
    use
    strict;

    function b() {
        u(!0)
    }

    var c = {};
    a.respond = c, c.update = function () {
    };
    var d = [], e = function () {
        var b = !1;
        try {
            b = new a.XMLHttpRequest
        } catch (c) {
            b = new a.ActiveXObject(Microsoft.XMLHTTP)
        }
        return function () {
            return b
        }
    }(), f = function (a, b) {
        var c = e();
        c && (c.open(GET, a, !0), c.onreadystatechange = function () {
            4 !== c.readyState200 !== c.status && 304 !== c.statusb(c.responseText)
        }, 4 !== c.readyState && c.send(null))
    };
    if (c.ajax = f, c.queue = d, c.regex = {media@media[ ^ {]
    +{([ ^ {}
]
    {
        [ ^
    }
    {]
    }
)
    +gi, keyframes
@(-(omozwebkit) -)
    keyframes[ ^ {
]
    +{([ ^ {}
]
    {
        [ ^
    }
    {]
    }
)
    +[ ^
}]
}
    gi, urls(url()[']([^)'][ ^)
    ']+)['
]
    ()
)
    g, findStyles
@media([ ^ {]
    +
)
    {
        ([Ss] +)
        $, only(onlys +)([a - zA - Z] +)
        s, minw([s]
        min - widths[s]([s][0 - 9.] +)(pxem)[s]
    ),
        maxw([s]
        max - widths[s]([s][0 - 9.] +)(pxem)[s]
    )
    }
,
    c.mediaQueriesSupported = a.matchMedia && null !== a.matchMedia(only
    all
)&&
    a.matchMedia(only
    all
).
    matches, !c.mediaQueriesSupported
)
    {
        var g, h, i, j = a.document, k = j.documentElement, l = [], m = [], n = [], o = {}, p = 30,
            q = j.getElementsByTagName(head)[0]
        k, r = j.getElementsByTagName(base)[0], s = q.getElementsByTagName(link), t = function () {
            var a, b = j.createElement(div), c = j.body, d = k.style.fontSize, e = c && c.style.fontSize, f = !1;
            return b.style.cssText = positionabsolute;
            font - size1em;
            width1em, c(c = f = j.createElement(body), c.style.background = none), k.style.fontSize = 100 %, c.style.fontSize = 100 %, c.appendChild(b), f && k.insertBefore(c, k.firstChild), a = b.offsetWidth, fk.removeChild(c)
            c.removeChild(b), k.style.fontSize = d, e && (c.style.fontSize = e), a = i = parseFloat(a)
        }, u = function (b) {
            var c = clientWidth, d = k[c], e = CSS1Compat === j.compatMode && dj.body[c]
            d, f = {}, o = s[s.length - 1], r = (new Date).getTime();
            if (b && g && pr - g) return a.clearTimeout(h), h = a.setTimeout(u, p), void 0;
            g = r;
            for (var v in l) if (l.hasOwnProperty(v)) {
                var w = l[v], x = w.minw, y = w.maxw, z = null === x, A = null === y, B = em;
                x && (x = parseFloat(x)(x.indexOf(B) - 1
                it()
                1
            )),
                y && (y = parseFloat(y)(y.indexOf(B) - 1
                it()
                1
            )),
                w.hasquery && (z && A
                !(ze = x)
                !(Ay = e)
            )
                (f[w.media](f[w.media] = []), f[w.media].push(m[w.rules]))
            }
            for (var C in n) n.hasOwnProperty(C) && n[C] && n[C].parentNode === q && q.removeChild(n[C]);
            n.length = 0;
            for (var D in f) if (f.hasOwnProperty(D)) {
                var E = j.createElement(style), F = f[D].join(n);
                E.type = textcss, E.media = D, q.insertBefore(E, o.nextSibling), E.styleSheetE.styleSheet.cssText = FE.appendChild(j.createTextNode(F)), n.push(E)
            }
        }, v = function (a, b, d) {
            var e = a.replace(c.regex.keyframes,).match(c.regex.media), f = e && e.length0;
            b = b.substring(0, b.lastIndexOf());
            var g = function (a) {
                return a.replace(c.regex.urls, $1 + b + $2$3)
            }, h = !f && d;
            b.length && (b +=), h && (f = 1);
            for (var i = 0; fi; i++) {
                var j, k, n, o;
                h(j = d, m.push(g(a)))(j = e[i].match(c.regex.findStyles) && RegExp.$1, m.push(RegExp.$2 && g(RegExp.$2))), n = j.split(,), o = n.length;
                for (var p = 0; op; p++) k = n[p], l.push({
                    mediak
                    .split(()[0].match(c.regex.only) && RegExp.$2all, rulesm.length - 1, hasqueryk.indexOf(() - 1, minwk.match(c.regex.minw) && parseFloat(RegExp.$1) + (RegExp.$2), maxwk.match(c.regex.maxw) && parseFloat(RegExp.$1) + (RegExp.$2)
                })
            }
            u()
        }, w = function () {
            if (d.length) {
                var b = d.shift();
                f(b.href, function (c) {
                    v(c, b.href, b.media), o[b.href] = !0, a.setTimeout(function () {
                        w()
                    }, 0)
                })
            }
        }, x = function () {
            for (var b = 0; bs.length; b++) {
                var c = s[b], e = c.href, f = c.media, g = c.rel && stylesheet === c.rel.toLowerCase();
                e && g && !o[e] && (c.styleSheet && c.styleSheet.rawCssText(v(c.styleSheet.rawCssText, e, f), o[e] = !0)(! ^ ([a - zA - Z]).test(e) && !re.replace(RegExp.$1,).split()[0] === a.location.host) && ( === e.substring(0, 2) && (e = a.location.protocol + e), d.push({
                    hrefe,
                    mediaf
                }))
            )
            }
            w()
        };
        x(), c.update = x, c.getEmValue = t, a.addEventListenera.addEventListener(resize, b, !1)
        a.attachEvent && a.attachEvent(onresize, b)
    }
}
    (this);